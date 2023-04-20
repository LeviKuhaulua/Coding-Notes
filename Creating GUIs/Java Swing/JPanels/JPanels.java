import javax.swing.*; 
import java.awt.*; 
public class JPanels {
    public static void main(String[] args) {
        
        // Creating frame 
        JFrame aFrame = new JFrame("Learning JPanels"); 
        aFrame.setSize(750, 750);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.setLayout(null); 

        // Creating Labels 
        JLabel labelOne = new JLabel(); 
        labelOne.setText("First String"); 
        labelOne.setBounds(0, 0, 100, 150); 
        

        JLabel labelTwo = new JLabel(); 
        labelTwo.setText("Second String"); 
        labelTwo.setBounds(50, 50, 100, 150); 

        JLabel labelThree = new JLabel(); 
        labelThree.setText("Third String");  
        labelThree.setBounds(0, 0, 100, 150);
        
        // Creating a bunch of panels 
        JPanel onePanel = new JPanel(null); 
        onePanel.setBounds(0, 0, 300, 300); 
        onePanel.setBackground(Color.MAGENTA); 
        
        JPanel twoPanel = new JPanel(null); 
        twoPanel.setBounds(300, 0, 300, 300); 
        twoPanel.setBackground(Color.BLUE); 

        JPanel threePanel = new JPanel(null); 
        threePanel.setBounds(0, 300, (onePanel.getWidth() + twoPanel.getWidth()), 200); 
        threePanel.setBackground(Color.GREEN);


        // Adding panels to the frame 
        aFrame.add(onePanel); 
        aFrame.add(twoPanel); 
        aFrame.add(threePanel); 

        onePanel.add(labelOne); 
        twoPanel.add(labelTwo); 
        threePanel.add(labelThree); 

        aFrame.setVisible(true);

    }
}