# Pop-up Windows 

**Process** 
1. Have an instance of a beginning frame 
- Property --> contains some sort of event to bring to new page 
2. User trigger events 
3. Opens up a new window or in this case frame 

**Make sure to:** in action performed method or event listener, include `*.dispose()`
- this ensures that user won't be able to create multiple new windows from that single event 
- * is the frame that will lead to the new frame 

**IMPORTANT** Need some sort of event to trigger a new window to open 


