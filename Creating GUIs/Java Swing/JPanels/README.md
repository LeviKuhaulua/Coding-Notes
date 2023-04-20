# JPanels 
**Use:** Acts as a container to hold other components

**Creating JPanels** 
`JPanel name = new JPanel()`
*Don't forget to add to the frame*. 


**Panels can be used to help with layout and function creation, can have multiple** 

**Adding components to panel** 
`*.add(Component)` where * is your panel <br>


panels use a flow layout manager which means that GUI components added into panel will fill components in first row (top-centered alignment) until full <br> 
To workaround this you can use `*.setLayout(new BorderLayout())` to make it aligned to the middle-left of the container

**Other Properties** 
Setting up other GUI components manually (`*.setBounds(dimensions)`), the content will be set up relative to the position of it's **CONTAINER**. In other words the frame or panel that it is stored in. 


