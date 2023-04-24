# JLayeredPane

**What is a JLayeredPane** Container that give depth for positioning components 
- components can be stacked on top or underneath each other 

Initialize: `JLayeredPane aLayeredPane = new JLayeredPane()`
- ensure that frame layout is set to null 
- ensure to set bounds for the layered pane 

**Order** 1st component added will be on the top, then each one is on the button 
- can switch up the order 

**Panel Order**
1. Default >> top most component
2. Palette 
3. Modal >> Middle component
4. PopUp
5. Drag >> last component

**Specifying which panel** <br> 
`*.add(JComponent, Integer.valueOf(0-5))`
- Higher number = higher placements 
OR <br> 
`*.add(JComponent, JLayeredPane.LAYER)`