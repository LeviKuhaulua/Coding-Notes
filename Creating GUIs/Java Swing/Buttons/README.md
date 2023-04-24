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

**Another Function** >> `*.setEnabled(false)`
- user cannot click on button again 

**Notes to remember** <br> 
Setting text to a button will cause a border to be around it, please use `*.setFocusable(false)` to get rid of that border. 
<br>

**Different types of buttons** 
1. Checkboxes >> allow user to select/deselect options
- Initializing: `JCheckBox name = new JCheckBox();`
2. Radio Buttons >> allow user to select one option out of a group
- Think of a form where you fill in the bubble that you choose
- Initializing: `JRadioButton name = new JRadioButton()`
- Group buttons using `ButtonGroup name = new ButtonGroup()`
    - `name.add(JRadioButton)`
3. Combo Boxes >> a drop-down list 
- Initialize: `JComboBox name = new JComboBox()`
    - pass into constructor an array of objects: could be classes or Primitive Data Types (using wrapper classes)
- To get option selected you will have to use `*.getSelectedItem()` OR `*.getSelectedIndex()` to get index of option selected
    - different from others where they use `e.getSource()`
    - `*.getSelectedIndex()` order goes from 0 to n where 0 is your first item 



**For listening to events, rmb to add buttons (and really any other JComponent) outside of your frame**

-------
