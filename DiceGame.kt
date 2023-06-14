
fun main() {
    val game = DiceGame()
    game.run()
}
class DiceGame {
    fun run () {
        val die1 = Die() // Create a die using the 0 argument constructor
        println("Die 1 - Type: ${die1.getType()}, Sides: ${die1.getSides()}, Current Side Up: ${die1.getCurrentSideUp()}")
        die1.roll()
        println("After rolling, Current Side Up: ${die1.getCurrentSideUp()}")

        // Create a die with 12 sides (1 argunment constructor)
        val die2 = Die(12)
        println("Die 2 - Type: ${die2.getType()}, Sides: ${die2.getSides()}, Current Side Up: ${die2.getCurrentSideUp()}")
        die2.roll()
        println("After rolling, Current Side Up: ${die2.getCurrentSideUp()}")

        // Create a die with 8 sides and a custom type (2 argument constructor)
        val die3 = Die(8, "d8")
        println("Die 3 - Type: ${die3.getType()}, Sides: ${die3.getSides()}, Current Side Up: ${die3.getCurrentSideUp()}")
        die3.roll()
        println("After rolling, Current Side Up: ${die3.getCurrentSideUp()}")

        // Create a die with default settings, then modify its sides and type
        val die4 = Die()
        die4.setSides(20)
        die4.setType("d20")
        println("Die 4 - Type: ${die4.getType()}, Sides: ${die4.getSides()}, Current Side Up: ${die4.getCurrentSideUp()}")
        die4.roll()
        println("After rolling, Current Side Up: ${die4.getCurrentSideUp()}")
    }

}