import kotlin.random.Random

class Die {
    private var type: String // Property to store the type of the die
    private var sides: Int // Property to store the number of sides of the die
    private var currentSideUp: Int // Property to store the current side facing up

    constructor() { // 0 argument constructor
        type = "d6" // Default type
        sides = 6 // Default number of sides
        roll() // Generate random side up
    }

    constructor(sides: Int) { // 1 argument constructor
        type = "d$sides" // Type based on the number of sides
        this.sides = sides
        roll()
    }

    constructor(sides: Int, type: String) { // 2 argument constructor
        this.type = type // Custom type
        this.sides = sides
        roll()
    }
    fun getType(): String { // Accessor for the type property
        return type
    }

    fun setType(type: String) { // Mutator for the type property
        this.type = type
    }

    fun getSides(): Int { // Accessor for the sides property
        return sides
    }

    fun setSides(sides: Int) { // Mutator for the sides property
        this.sides = sides
    }

    fun getCurrentSideUp(): Int { // Accessor for the currentSideUp property
        return currentSideUp
    }

    fun roll() { // Method to generate a random value for the current side up
        currentSideUp = Random.nextInt(1, sides + 1)
    }

    }


