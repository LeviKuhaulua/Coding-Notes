import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; 


public class StudentGradeFrame implements ActionListener, ChangeListener{
    private JFrame studentGUI; // Main Window
    private JPanel studentPanel, gradingPanel, outputPanel; // Three panels for design. These are the parent panels 
    private JPanel selectStudentPanel, inputGradePanel, outputGradePanel; // The three sub-panels for the parent panels 
    private JComboBox<String> selectStudents; // Combo-box for user to choose students 
    private JSlider inputGrade; // Slider for user to input grades 
    private JTextField outputGrade; //  textfield to output the grades of a student
    private int grade; // To get the grade from the slider and then convert to a letter grade 
    private JButton inputButton; // For users to select button to get the input of the 


    StudentGradeFrame() {
        studentGUI = new JFrame("Inputting Student Grades"); 
        // Setting-up the JFrame component  
        studentGUI.setSize(1200, 500); 
        studentGUI.setLocationRelativeTo(null); 
        studentGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentGUI.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

        // Setting-up the parent panels 
        configureParentPanels(); 
        setUpList(); 
        setUpSlider(); 
        setUpOutput(); 
        
        // Adding parent panels to the frame 
        studentGUI.add(studentPanel); 
        studentGUI.add(gradingPanel); 
        studentGUI.add(outputPanel); 
        
        studentGUI.setVisible(true); // making panel visible to user 
        
    }

    /**
     * configureParentPanels will border and size the panels to the frame 
     */
    private final void configureParentPanels() {
        // Variables for sizing panels 
        final int panelWidth = 300; 
        final int panelHeight = 300; 

        // Setting up 
        studentPanel = new JPanel(); 
        gradingPanel = new JPanel(); 
        outputPanel = new JPanel(); 

        // Bordering Panels that will title the sections 
        studentPanel.setBorder(BorderFactory.createTitledBorder("Student"));
        gradingPanel.setBorder(BorderFactory.createTitledBorder("Grades")); 
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output")); 


        // Sizing Panels
        studentPanel.setPreferredSize(new Dimension(panelWidth, panelHeight)); 
        gradingPanel.setPreferredSize(new Dimension(panelWidth, panelHeight));
        outputPanel.setPreferredSize(new Dimension(panelWidth, panelHeight));

        // Setting-up sub panels and adding it to the sub-panels
        selectStudentPanel = new JPanel(null); 
        inputGradePanel = new JPanel(null); 
        outputGradePanel = new JPanel(); 

        // Bordering sub panels 
        selectStudentPanel.setBorder(BorderFactory.createTitledBorder("Select Students")); 
        inputGradePanel.setBorder(BorderFactory.createTitledBorder("Input Grades")); 
        outputGradePanel.setBorder(BorderFactory.createTitledBorder("Student Grade")); 


        // Sizing sub panels 
        selectStudentPanel.setPreferredSize(new Dimension((panelWidth - 50), (panelHeight - 50)));
        inputGradePanel.setPreferredSize(new Dimension((panelWidth - 50), (panelHeight - 50)));
        outputGradePanel.setPreferredSize(new Dimension((panelWidth - 50), (panelHeight - 50))); 

        // Adding sub panels 
        studentPanel.add(selectStudentPanel); 
        gradingPanel.add(inputGradePanel); 
        outputPanel.add(outputGradePanel); 
        
    }

    /**
     * setUpList is a private method that will set up the combo box component for a user to enter grades
     */
    private void setUpList() {
        // Setting the layout 
        selectStudentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30)); 

        // Creates an already initialized list
        final String[] listOfStudents = {"Levi", "Janica", "Bosteezy", "Shay", "Pablo"}; 
        selectStudents = new JComboBox<String>(listOfStudents); // Make the combo box add the list of components
        
        
        selectStudentPanel.add(selectStudents); // Add combo-box to component 
    }

    /**
     * setUpSlider is a private method that will set up the slider component to allow user to input grades
     * for a selected students. 
     */
    private void setUpSlider() {
        // Setting-up panel layout 
        inputGradePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0)); 

        // Setting up the slider
        inputGrade = new JSlider(0, 100, 0);
        inputGrade.setOrientation(SwingConstants.VERTICAL); // Vertical slider
        // Tick spacing for grade differentiation and highlighting tick placements 
        inputGrade.setMajorTickSpacing(10); 
        inputGrade.setMinorTickSpacing(2);
        inputGrade.setPaintTicks(true); 
        inputGrade.setPaintLabels(true);
        inputGrade.addChangeListener(this); // to update the output text field when change happens 
        
        inputGradePanel.add(inputGrade); // adding to the panel  
    }

    /**
     * setUpOutput is a private method to help with the setup of a function 
     */
    private void setUpOutput() {
        // Setting layout of the panel 
        outputGradePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); 
        // Creating a JTextField
        outputGrade = new JTextField(20);  
        outputGrade.setEditable(false); // make sure user can't edit it     
        
        outputGradePanel.add(outputGrade); // add to the panel 
    }
    
    /**
     * convertToLetterGrade will take the number value of a grade and convert it to the right letter grade. 
     * @param numberGrade are the values that are appearing whenever user adjusts the slider
     * @return letter grade equivalent of the numeric grade
     */
    private String convertToLetterGrade(int numberGrade) {
        String letterGrade = null; 
        if (numberGrade <= 100 && numberGrade >= 90) {
            letterGrade = "A";
        } else if (numberGrade < 90 && numberGrade >= 80) {
            letterGrade = "B";
        } else if (numberGrade < 80 && numberGrade >= 70) {
            letterGrade = "C"; 
        } else if (numberGrade < 70 && numberGrade >= 60) {
            letterGrade = "D"; 
        } else letterGrade = "F"; 

        return letterGrade; // returns the equivalent 
    }
    

    @Override 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputButton) {
            grade = inputGrade.getValue(); 
            System.out.println(grade);
        }
    }
   
    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == inputGrade) {
            grade = inputGrade.getValue(); 
            outputGrade.setText(convertToLetterGrade(grade)); 
        }
    }
    

    
}