# Key Bindings 
**What it do** binds an action to a keystroke 
- all swing components use key bindings 
- more flexibility compared to key listeners 
- more difficult to set up 

**Set-up** 
Create a method for an action that will extend `AbstractAction` <br> 
Create an inner `actionPerformed` class for what happens when certain key is pressed <br> 
Create an Action instance >> `Action name`<br> 
Make instance equal to method you created in 1st step  <br> 
`*.getInputMapMethod().put(KeyStroke.getKeyStroke(Key-Char), action-map-key)` <br> 
`*.getActionMap().put(action-map-key, action)`
- where action is some Action instance in step 3 

**Very useful for game development**: Co-op games, key binds for controls 