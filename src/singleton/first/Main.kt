package singleton.first

fun main() {
    val gameEngine1: GameEngine = GameEngine.getInstance()
    val gameEngine2: GameEngine = GameEngine.getInstance()
    // val gameEngine3: GameEngine = GameEngine()

    println(gameEngine1 == gameEngine2)
}