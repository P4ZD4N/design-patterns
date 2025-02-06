package proxy.first

class SavedGameProxy : SavedGame {

    lateinit var name: String
    private lateinit var savedGame: SavedGame

    override fun initialize() {
        name = "Saved game - ${System.currentTimeMillis()}"
    }

    override fun loadGame() {
        savedGame = SavedGameFull()
        savedGame.initialize()
        savedGame.loadGame()
    }
}