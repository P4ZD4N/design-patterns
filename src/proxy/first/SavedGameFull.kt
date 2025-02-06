package proxy.first

import java.lang.Thread.sleep

class SavedGameFull : SavedGame {

    lateinit var name: String
    private lateinit var gameData: String

    override fun initialize() {
        name = "Saved game - ${System.currentTimeMillis()}"
        gameData = loadFromStorage()
    }

    override fun loadGame() {
        println("Game loaded")
    }

    private fun loadFromStorage(): String {
        try {
            sleep(500)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        return "Loaded"
    }
}