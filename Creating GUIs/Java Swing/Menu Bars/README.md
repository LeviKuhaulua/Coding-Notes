# Menu Bars
**Use:** For users to have multiple options on a particular section

Initalize: `JMenuBar name = new JMenuBar()`

To add: `*.setJMenuBar(JMenuBar)`
- * is the frame 

**Adding Menus** <br> 
1. Create your menu >> `JMenu name = new JMenu(Title)`
2. Create menu items >> `JMenuItem name = new JMenuItem(Title)`
3. Add to menu >> `*.add(JMenuItem)`
4. Add to JMenuBar >> `*.add(JMenu)`
- * is your JMenuBar

**Afterwards, create ActionListeners for your menu items so that they do item** <br> 

```
// repeat for however many menu items you have
*.addActionListener(this); 

public void actionPerformed(ActionEvent e) {
    // Code for when user clicks on menuitems
}
```

**Setting Keyboard Shortcuts for Menu Items** <br> 
Keyboard Shortcuts = Mnemonic keys 

1. `*.setMnemonic(KeyEvent.VK_LETTER)`
- User navigates to tab first, then presses letter 
- this can be used for menu items and menus (or tabs). 
    - for menus the shortcut will be Alt + LETTER
