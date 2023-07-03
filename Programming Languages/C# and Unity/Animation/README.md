# Animations

How to create animations and apply them to objects in your game. 

As always, create a __Animations__ folder to hold all your animations for objects in your game. Then open up the Animation window by clicking on `Window` then selecting `Animation` twice. After the `Animation` tab opens up, select your player then `Create a clip` and save the animation in your Animations folder. <br> 

__How to - Configure the Animation Tab__: Click on the three dots (one right below the lock symbol) and select `Show sample rate` this will help you with setting how fast your animation clip will play. 


__Creating the animation__: Using the character sprites in your file holding the character, select the ones that are meant for certain animations (i.e idle, moving, emotes, etc.). Drag them onto the right-hand side of the animation tab and space them out evenly. One way to space them out is to change the sample rate and then spacing them out so that the sprite looks like it is moving on normal speed. 

*NOTES* -: 60 frames is equal to 1 second. 30 frames is equal to 1/2 of a second. 


__Applying the animation__: 
1. Open up the `Animator` for your animations - should appear in your Animations folder 
2. Create blend trees that relate to specific animations (ex: one for idle, the other for movement). 
3. Add the animations into the blend trees 
4. Create parameters for these blend trees for these animations if needed
5. Create transitions between blend trees (that might use certain parameters) so that player sprite may transition between the two animations.


__Animation for Movement__: 
1. Create blend trees related to movement and idle 
2. Parameters for the trees will be the x and y values plus a `bool` that will check if the player is moving. 
3. Attach the animations onto the respective blend trees and check to see if the player will face the right way for the animations. 
4. Add a transition and a condition for when to have animations transition from idle to movement. 
    - This is where `bool` comes in. If moving, then have player sprite do movement animations, else do the idle animation. 
5. Save the changes then code the logic in your player script. 
    - [Movement Script](Movement.cs)