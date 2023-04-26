import javax.swing.*; 
import java.awt.*; 

public class StudentGradeFrame {
    private JFrame studentGUI; // Main Window
    private JPanel studentPanel, gradingPanel, outputPanel; // Three panels for design. These are the parent panels  

    StudentGradeFrame() {
        studentGUI = new JFrame("Inputting Student Grades"); 
        // Setting-up the JFrame component 
        studentGUI.setSize(720, 400); 
        studentGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentGUI.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

        // Setting-up the parent panels 
        configureParentPanels(); 
        
        // Adding parent panels to the frame 
        studentGUI.add(studentPanel); 
        studentGUI.add(gradingPanel); 
        studentGUI.add(outputPanel); 
        
        studentGUI.setVisible(true); // making panel visible to user 
        
    }

    /**
     * configureParentPanels will border and size the panels to the frame 
     */
    private void configureParentPanels() {
        // Setting up 
        studentPanel = new JPanel(); 
        gradingPanel = new JPanel(); 
        outputPanel = new JPanel(); 

        // Bordering Panels that will title the sections 
        studentPanel.setBorder(BorderFactory.createTitledBorder("Student"));
        gradingPanel.setBorder(BorderFactory.createTitledBorder("Grades")); 
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output")); 
        

        // Sizing Panels
        studentPanel.setPreferredSize(new Dimension(200, 300)); 
        gradingPanel.setPreferredSize(new Dimension(200, 300));
        outputPanel.setPreferredSize(new Dimension(200, 300));
        
        
    }

   
    

    
}