import javax.swing.*; 
import java.awt.*; 
public class JPanels {
    public static void main(String[] args) {
        
        // Creating frame 
        JFrame aFrame = new JFrame("Learning JPanels"); 
        aFrame.setSize(750, 750);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.setVisible(true);
        aFrame.setLayout(null); 

        // Creating a bunch of panels 
        JPanel onePanel = new JPanel(null); 
        onePanel.setBounds(0, 0, 300, 300); 
        onePanel.setBackground(Color.MAGENTA); 
        
        
        JPanel twoPanel = new JPanel(null); 
        twoPanel.setBounds(300, 0, 300, 300); 
        twoPanel.setBackground(Color.BLUE); 

        JPanel threePanel = new JPanel(null); 
        threePanel.setBounds(0, 300, 600, 300); 
        threePanel.setBackground(Color.GREEN);

        aFrame.add(onePanel); 
        aFrame.add(twoPanel); 
        aFrame.add(threePanel); 

    }
}