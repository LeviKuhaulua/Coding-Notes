import javax.swing.*; 
import java.awt.Color; 
import java.awt.Font; 

public class JLabels {
    public static void main(String[] args) {
       
        // Initializing JPanels 
        JFrame basicPanel = new JFrame(); 
        basicPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        basicPanel.setTitle("Learning JLabels"); 
        basicPanel.setSize(500, 500); 

        /**
         * Learning JLabels 
         */
        JLabel fancyLabel = new JLabel(); // Initialize Label 
        basicPanel.setLayout(null); // allowing for manual format of label 
        fancyLabel.setBounds(10, 10, 500, 500); // manually formatting a label 
        fancyLabel.setText("Business Idea"); 
        fancyLabel.setFont(new Font("Helvetica", Font.ITALIC, 20)); // Styling the text 
        fancyLabel.setForeground(Color.BLACK);

        basicPanel.add(fancyLabel); 

        basicPanel.setVisible(true);
    }
}