package singleton.second

import kotlin.random.Random

class GuessGame private constructor() {

    private var score: Int = 0;

    fun play() {
        for (i in 1..10) {
            val randomInt = Random.nextInt(1, 11)

            print("Guess number (1-10): ")
            val value = readln()

            if (value.toInt() == randomInt) {
                score++
                println("+1")
            } else println(":(")
        }
    }

    fun getScore(): Int {
        return score
    }

    companion object {
        private var instance: GuessGame = GuessGame()

        fun getInstance(): GuessGame {
            return instance
        }
    }
}