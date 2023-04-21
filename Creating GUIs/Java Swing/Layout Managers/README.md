# Layout Managers 
**Use:** Great way of sectioning groups/elements within your frame 

## Border Layout Managers 
Initializing a Border Layout>> `*.setLayout(new BorderLayout());`
- BorderLayout is usually default layout manager for components

**Border Layout Managers** set elements/groups in five positions: 
1. North >> top of the container 
2. South >> bottom of the container 
3. East >> right of the container
4. West >> left of the container 
5. Center >> middle of the container 

To set the container to a specific position >> `*.add(container, BorderLayout.POSITION)`
- where * is your frame 

**You can also do this for sub-groups within that container** 
- Same steps: `setLayout` >> `add(container, BorderLayout.POSITION)`
    - now you have a parent container holding a sub/child container 

**Properties of containers:**
Horizontal Containers (East/West) will resize vertically and not horizontally <br>
Vertical Containers (North/South) will resize horizontally, and not vertically <br>
Center Container will resize both horizontally and vertically 

* Other property >> extra space in layout is added to the center area 

**Setting Margins**
To do this: `*.setLayout(new BorderLayout(x-margin, y-margin))`
- x-margin and y-margin is counted in pixels 

-------
## Flow Layout Managers 
How they work: places elements in rows and sizes them to preferred size. If row is full, then place element in next available row 

Initializing a Flow Layout >> `*.setLayout(new FlowLayout())` 
- Rmb by default, BorderLayout is used 

**Properties** 
If there is no space, it will push components to next row 
- think of resizing a browser and how elements get pushed to weird positions if small enough or big enough 


**Setting Positioning** 
Think of positioning as alignments <br>
Syntax >> `*.setLayout(new FlowLayout(FlowLayout.POSITIONING))`
- Positions: CENTER, LEADING, TRAILING
    - LEADING = LEFT, TRAILING = RIGHT (also have LEFT/RIGHT options)

**When resizing, elements/components will continue to have same position orientation**

**Spacing components**
Syntax >> `*.setLayout(new FlowLayout(FlowLayout.POSITIONING, horizontal-gap, vertical-gap))`

-------
## Grid Layout Managers
**Use:** Places components/elements in a grid of cells (like a table w/ rows and columns ) 

**Properties** 
- Each component/element takes all the available space in a cell 
- All cells are the same size 
- Adding to an already full grid will cause the manager to create a new column to evenly balance each component


Initialize a Grid Layout >> `*.setLayout(new GridLayout)`

Adding Rows/Column >>   `*.setLayout(new GridLayout(rows, columns))`

**Spacing**
* Still the same >> `*.setLayout(new GridLayout(rows, columns, horizontal-margin, vertical-margin))`

-------










