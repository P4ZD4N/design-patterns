package singleton.first

class GameEngine private constructor() {

    val hp: Number = 100
    val characterName: String = ""

    companion object {
        private var instance: GameEngine = GameEngine()

        fun getInstance(): GameEngine {
            return instance
        }
    }

    fun run() {
        while (true) {
            // ...
        }
    }
}