package game

class DiceGame {
    fun run() {
        val die1 = Die() // Create a die using the default constructor
        val die2 = Die(Sides.FOUR) // Create a die with specified number of sides
        val die3 = Die(Color.ORANGE, Sides.TWENTY) // Create a die with specified color and number of sides

        // Display die information before and after rolling
        println("Die 1 - Color: ${die1.getColor()}, Sides: ${die1.getNumSides()}, Current Side Up: ${die1.sideUp}")
        die1.roll()
        println("After rolling, Current Side Up: ${die1.sideUp}")

        println("Die 2 - Color: ${die2.getColor()}, Sides: ${die2.getNumSides()}, Current Side Up: ${die2.sideUp}")
        die2.roll()
        println("After rolling, Current Side Up: ${die2.sideUp}")

        println("Die 3 - Color: ${die3.getColor()}, Sides: ${die3.getNumSides()}, Current Side Up: ${die3.sideUp}")
        die3.roll()
        println("After rolling, Current Side Up: ${die3.sideUp}")

        
}

fun main() {
    val game = DiceGame()
    game.run() // Run the dice game
}