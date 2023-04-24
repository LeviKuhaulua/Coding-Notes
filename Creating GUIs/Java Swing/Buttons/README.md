# Buttons 
**How they work:** Perform an action when they are clicked

Initialize: `JButtone name = new JButton();`
- `*.setBounds(x, y, width, height) for placement of button` 

Listening for events: 
`implements ActionListener`

**Needs**
1. Action Listener
-  `*.addActionListener(this)`
    - `this` refers to the JComponent 
2. Action Performed 
- `public void actionPerformed(ActionEvent e) code
    - condition is `e.getSource() == component`
        - in this case component is equal to button 

**Shortcut: Lambda** >> no need implements ActionListener <br> 
`*.addActionListener(e -> code)`
- advanced concept --> research more about lambda expressions 

**Notes to remember** <br> 
Setting text to a button will cause a border to be around it, please use `*.setFocusable(false)` to get rid of that border. 
