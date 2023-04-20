import javax.swing.*; 
import java.awt.Color; 
public class JFrames {
    public static void main(String[] args) {
        
        JFrame basicPanel = new JFrame(); // Create the frame
        basicPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allow user to close the frame 
        basicPanel.setTitle("Just a JFrame"); // Creating title for JFrame

        // Sizing Frame 
        basicPanel.setSize(400, 400); 
        basicPanel.setResizable(true); // making frame unable to be resized 

        // Styling Frame
        basicPanel.getContentPane().setBackground(new Color(0x7c2ac9)); 
        ImageIcon coolLogo = new ImageIcon("cool-Image.png"); 
        basicPanel.setIconImage(coolLogo.getImage()); 

        // Making frame to be visible
        basicPanel.setVisible(true); 
        
    }
}