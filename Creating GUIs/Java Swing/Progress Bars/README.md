# Progress Bars
**Use:** Visual way of showing user that something is happening 

Initalize: `JProgressBar name = new JProgressBar()` <br> 
**THEN** <br> 
`*.setValue(int)` to highlight initial value of bar
- usually 0, unless game development then health bar (maybe?)

**Tracking progress of bar** >> `*.setStringPainted(true)`

**Have some sort of method/event to increment progress bar** 
- uses the `setValue(int)` to continuosly increment 

``` 
try {
    Thread.sleep(n)
} catch (InterruptedException e) {
    // code for interruption
}
```
<br> 

`Thread.sleep(n)` pauses program for n units (usually milliseconds) 
- helps with smoothly incrementing progress

**Properties**
`setForeground(Color)` will change the fill color <br> 
`setBackground(Color)` will make the background of the bar equal to that color