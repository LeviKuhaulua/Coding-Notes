# Movement

Purpose: To learn various ways to moving a sprite. <br> 

__What is needed?__ <br> 
1. Sprite --> Object that will be needed to move 
2. Inputs --> What are your binds for movement? 
3. Script --> file that will handle player movement 

__Inputs and Action Maps__: <br> 
Action Maps are one of the ways that you can use to get the binds associated for moving your Player Character. You can do this through 2 ways - Action Maps or Input Managers. 

1. Input Managers --> old school - Has multiple axes (i.e Horizontal, Vertical) where you can assign binds to them. 
    - a. Navigate to the `Edit` tab --> Go to `Project Settings` and find `Input Manager` --> Expand the section (if necessary) --> Change key binds for the `Horizontal` and `Vertical Axes`
    - __NOTE__: Change the `Type` dropbox to reflect the button / bind type - Keyboard, Mouse, or Joystick / Controller 
2. Action Maps --> Unity's new input manager system which allows for binds to be associated for a multitude of things - think moving or using abilities 
    - a. Navigate to the `Window` tab and select `Packet Manager` --> Import the `Input System` package in Unity Registry --> Create a file in your `Assets` folder for Binds / Inputs --> Create a new `Input Actions` object (may need to scroll all the way down to find) 
    - b. Create an __Action Map__ with associated Actions (for 2D, choose Value for `Action Type` and Vector2 for `Control Type`)
    - c. Add Bindings 
<br> 
Please use the following video as a guide to how [Action Maps](https://www.youtube.com/watch?v=xrLlZ1mHCTA) work. 
<br> 

__Movement Script__: <br> 
Coding the logic that will move your character sprite. The general idea is that you want to transform the player's original position to the target. The [Movement Script](Movement.cs) shows some examples as to how to do this.