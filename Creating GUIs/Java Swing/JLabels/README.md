## JLabel 

**Use:** Displays an area for text strings, image(s), or both 

Initialize a JLabel >> `JLabel name = new JLabel();`
- Can put text string or image inside the parentheses when initializing

**Adding Strings to Labels**
1. `*.setText(String)` will set the text to that string 
2. `frame.add(*);` Need to have your JFrame add the label to view 

**Adding Images to Labels**
1. Initialize an ImageIcon >> `ImageIcon image = new ImageIcon(*);`
    - * = image with file extension (assuming it's inside source folder)
2. *.setIcon(image); 
    - * = JLabel 

**Positioning Strings around Icon**
*Likes to set Strings to the right and center of your image* 
Horizontal Position: `*.setHorizontalTextPosition(JLabel.POSITION)`
    - Positions are LEFT, CENTER, or RIGHT
Vertical Position: `*.setVerticalTextPosition(JLabel.POSITION)`
    - Positions are TOP, BOTTOM, or CENTER

**Label Positioning** 
*Put both string and icon to different parts of the frame*
1. `*.setVerticalAlignment(JLabel.POSITION)`
2. `*.setHorizontalAlignment(JLable.POSITION)`
- Still the same positions for respective axis 

**Label Styling**
1. Font Colors 
    1. `*.setForground(Color)` to set the font color 
        - Can use RGB or Hex values for color 
2. Change Font 
    1. `*.setFont(new Font("font", property, size))`
        - Property like underline or bold 
3. Adjust Gap between String and Icon
    1. `*.setIconTextGap(int)`
        - positive increases gap 
        - negative decreases gap 
4. Background Colors 
    1. `*.setBackground(Color)` 
    2. Then do `*.setOpaque(true)` to display background color 
    - **Labels like to take up as much room as possible, even when resizing**
- **For these styling** many of these methods apply to almost all of these components (Not unique to any class/method)

**Sizing & Positioning Labels**
- Default Layout Manager will make label take up as much room as possible

1. Manual Set-up
    - *Using for now till I watch layout manager* 
    1. `frame.setLayout(null)` to prevent the layout manager from auto-formatting labels 
    2. `*.setBounds(x, y, width, height)` to size the label and position the label 
        - (x,y) is the position of label where (0,0) is the top-left corner of frame 