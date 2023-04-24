# JOptionPane
**Use:** dialog box meant to tell user something 
- prompt, error message, etc. 

**Message Dialog** <br> 
dialog box that has different types of messages that tells user something <br> 
Initialize: `JOptionPane.showMessageDialog(JComponent, String, Title, Message-Type)`
- Message-Type Format >> TYPE_MESSAGE
    - Distinguishing feature is the icon for dialog box

Different Message Types: 
1. JOptionPane.PLAIN_MESSAGE >>  no icon
2. JOptionPane.INFORMATION_MESSAGE >> 'i' icon
3. JOptionPane.QUESTION_MESSAGE >> question icon 
4. JOptionPane.WARNING_MESSAGE >> Caution icon 
5. JOptionPane.ERROR_MESSAGE >> Stop sign icon 

Get User Input: <br> 
Initialize: `JOptionPane.showConfirmDialog(JComponent, String, Title, Option-Type)`
- Option-Type specifies what kind of input you want user to provide 

**For String Inputs** >> `JOptionPane.showInputDialog(String)`

**Some Examples:** 
1. JOptionPane.YES_NO_CANCEL_QUESTION >> dialog box with buttons of yes, no, and cancel 
- Yes = 0 | No = 1 | Cancel = 2 | Closing = -1 

**Full Dialog Box Options** <br> 
`JOptionPane.showActionDialog(JComponent, String, Title, Option-Type, Message-Type, icon, options, initial-value)`
- icon replaces the symbol used for the message-type 
- options will customize the text of the buttons
    - need to create an array that holds the options for these buttons
- initial-value refers to what is initially selected 