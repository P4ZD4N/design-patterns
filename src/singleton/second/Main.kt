package singleton.second

fun main() {
    val game: GuessGame = GuessGame.getInstance()

    game.play()

    val score: Int = game.getScore()
    val anotherGameReference: GuessGame = GuessGame.getInstance()

    if (game == anotherGameReference) {
        println("Singleton!")

        if (score == anotherGameReference.getScore()) println("Points: ${score}")
    }
}