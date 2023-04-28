# Key Listeners
**Use:** Performs actions when user does something with a key 

Need >> `implements KeyListener` <br> 
Methods to Override: 
1. `keyTyped`
2. `keyPressed`
3. `keyReleased`

`JFrame.addKeyListener(this)` to add key events to the window

**Properties of the Methods** 
1. `keyTyped` >> invoked when user types a key. 
- uses KeyChar, outputs character that is pressed 
2. `keyPressed` >> key is pressed down
- gives keyCode, and outputs associated value with key 
3. `keyReleased` >> key is released 

**Get Key Characters** >> `*.getKeyChar()`
- differentiates between capitals 
**Get Key Codes** >> `*.getKeyCode()` 
- does not differentiate with capitals 

**Definitely useful for game development** >> move sprites around the map
