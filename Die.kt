package game

import kotlin.random.Random

// Define an enumeration for colors of the die
enum class Color {
    RED,
    WHITE,
    ORANGE,
    BLACK
}

// Define an enumeration for the number of sides of the die
enum class Sides(val value: Int) {
    THREE(3),
    FOUR(4),
    SIX(6),
    TWENTY(20),
}

// Define the Die class
class Die(private val color: Color, private val numSides: Sides) {
    var sideUp: Int = 1 // Property to store the current side facing up, initialized to 1
        private set // Private setter to ensure sideUp can only be modified internally

    // Initialization block that runs when a Die object is created
    init {
        roll() // Call the roll method to set the initial side up
    }

    // Secondary constructor that takes only the number of sides and uses default color
    constructor(numSides: Sides) : this(Color.WHITE, numSides)

    // Secondary constructor that takes no arguments and uses default color and number of sides
    constructor() : this(Color.RED, Sides.SIX)

    // Method to simulate rolling the die and generate a random side up
    fun roll() {
        sideUp = Random.nextInt(1, numSides.value + 1)
    }

    //Method to get the color of the die
    fun getColor(): Color {
        return color
    }
    //Method to get the number os sides of the die
    fun getNumSides(): Sides {
        return numSides
    }
    //Method to set the sideUp value of the die
    fun setSideUp(value: Int) {
        sideUp = value
    }
   
}

