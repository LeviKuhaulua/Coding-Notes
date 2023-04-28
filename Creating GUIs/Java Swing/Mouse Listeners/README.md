# Mouse Listeners
**Use:** Perform an action when something happens with the mouse 

Need >> `implements MouseListener`<br> 
Methods to override: 
1. `mouseClicked` - mouse has been clicked (both pressed and released)
- works for right-click, middle-click (scroll wheel)
2. `mousePressed` - when mouse has clicked on a component
- works for right-click, middle-click (scroll wheel)
3. `mouseReleased`- when mouse has been release over a component
4. `mouseEntered`- when mouse enters a component's area
5. `mouseExited`- when mouse exits a component's area 

`*.addMouseListener(this)` to add mouse listener to components or frames 
- methods will only work for components/frames that have this
- Applying the mouse listener to a specific component MATTERS
    - frame will mean that EVERYTHING is affected by mouse events 

