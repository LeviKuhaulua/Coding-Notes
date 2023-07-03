using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.InputSystem; // Needed for Action Map 

public class Movement : MonoBehavior {

    // Action Map
    [SerializeField] private float movementSpeed; // To adjust in Unity, make sure to change value once you find right speed in Unity
    
    private Rigidbody2D PlayerRb; // variable to hold Rigidbody reference 
    
    private Vector2 movementInput; // Getting the x and y values from player input when movement key is pressed 

    private void Awake() {
        PlayerRb = GetComponent<Rigidbody2D>(); // Gets the Rigidbody2D component 
    }

    // Movement is the 'Action' in the Action Map. 
    private void OnMovement(InputValue input) {
        movementInput = input.Get<Vector2>(); 

        Debug.log($"(x, y) -: ({movementInput.x}, {movementInput.y})"); // Checks if Vector2 values appear when user presses movement key 

    }

    private void FixedUpdate() {
        PlayerRb.MovePosition(PlayerRb.position + movementInput * movementSpeed * Time.fixedDeltaTime); 
    }








}