# File Input
**Purpose:** Getting file input and outputting to a file using a GUI in Swing 

**Steps:**
1. Something to select file
- Menu-Item, Button, etc. 
2. Action happens for component 
- need `ActionListener` and method for handling actions
3. Do whatever (for file) 

Initializing: `JFileChooser name = new JFileChooser()`

**Opening a File** <br> 

`fileChooser.showOpenDialog(parent-component)`
- selects a file 
- returns 0 if file was selected, else return 1 (user cancels or exits)

**THEN** <br> 

``` 
// successfully chooses a file 
if (* == JFileChooser.APPROVE_OPTION) {
    File name = new File(*.getSelectedFile().getAbsolutePath())
    // code for whatever to do with file 
}
```
- could replace `File` with other things like `BufferedReader`
- IMPORTANT is the `*.getSelectedFile().getAbsoutePath()` is to get the full path of a file that user wants to open 




