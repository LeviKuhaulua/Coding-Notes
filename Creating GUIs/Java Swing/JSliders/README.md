# JSliders
**Purpose** lets user enter values through adjusing a knob 

**Needs** `implements ChangeListener`
- used for updating something when change is made 

Initialize: `JSlider name = new JSlider()`
- can add parameters: `new JSlider(min, max, starting-point)`
    - starting-point is where the knob will be

**Detailing a JSlider** <br> 
`*.setPaintTicks(true)` to create ticks <br> 
`*.setMinorTickSpacing(interval)` to create small ticks for every interval <br>
`*.setMajorTickSpacing(interval)` to create the big ticks for every interval <br>
`*.setPaintLabel(true)` to highlight the interval for MAJOR TICKS
- not the small tick spaces
`*.setOrientation(SwingConstants.ORIENTATION)` to make slider be horizontal or vertical 

**Getting Data** <br> 
`*.getValue()` gets current value that slider is on
- However, it does NOT show changed values on window when adjusted

`*.addChangeListener(this)` so that system will detect when slider is adjusted. **THEN** <br>

``` 
@Override
public void changedState(ChangeEvent e) {
    /* 
        Code that has getValue() method of JSlider 
        to output changed values to the window
    */ 
}
```