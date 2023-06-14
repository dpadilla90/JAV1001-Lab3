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

         // Choose one Die object and set it to show its highest value
         val die4 = Die()
         die4.setSideUp(die4.getNumSides().value)
         println("Die 4 - Color: ${die4.getColor()}, Sides: ${die4.getNumSides()}, Current Side Up: ${die4.sideUp}")

         // Create 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind. Count and display the number of rolls.

         // Create an empty mutable list to hold instances of the Die class
        val dice = mutableListOf<Die>()
        repeat(5) {
            //repeat code five times to create 5 six-sided dice
            val die = Die()
            dice.add(die)
        }
        //intialize variable rolls to  0
        var rolls = 0
        // Enter an infinite loop to roll the dice until a condition is met
        while (true) {
            // Increment the rolls counter by 1
            rolls++
            // Roll each die in the dice list
            for (die in dice) {
                die.roll()
            }
            // Check if all dice have the same side facing up as the first die
            if (dice.all { it.sideUp == dice[0].sideUp }) {
                // If all dice have the same side up, break out of the loop
                break
            }
        }
        // Print the number of rolls it took to get 5 dice with the same side up
        println("Number of rolls to get 5 of a kind: $rolls")
}
}
//Main function to run the game 
fun main() {
    val game = DiceGame()
    game.run() // Run the dice game
}

