# Creating GUIs Using Java Swing <br> 
**Notes for learning how Java Swing works with creating GUIs** 

[Video for Learning](https://www.youtube.com/watch?v=Kmgo00avvEw)

NEED TO IMPORT: `javax.swing.*;`

## The Basics of Creating 

**Create a Frame** <br> 
A JFrame is a panel/window that user will use to interact with buttons, fields, etc. 

To create a frame, one just needs to do the following: `JFrame name = new JFrame();` 
- **This does not mean that the panel is visible** 
- To make the panel visible to user use `.setVisible(true)`

*To title a frame (text on the tab/panel ribbon)*, use `.setTitle(String)` <br>
*To close a frame*, use `.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`
- Clicking the 'x' button to close the window actually just hides the panel and not close it 


**Sizing a Frame** 
> frame.setSize(width, height); <br> 
- helps to set the size of the panel 

>.setResizable(boolean); 
- prevents frame from being resized 

**Styling your Panel** <br> 
- **Logo**
    1. Get image you wish to use 
    2. Download 
        - **Seems like best practice to keep in project folder**
    3. Use `ImageIcon image = new ImageIcon(iconName)` 
        - In project folder? **THEN** all you need is name of file
        - Outside project folder? **THEN** you also need file path
    4. Use `*.setIconImage(*.getImage())`
- **Background Color**
    1. import `java.awt.Color`
    2. Use `*.getContentPane().setBackground(Color.*)`
        - For custom colors, replace `Color.*` with `new Color(r, g, b)`
            - from range of 0 to 255 OR use Hexadecimal value [0x(6 digits)]

**What you can do is make a child class that extends JFrame and then use methods there** 


