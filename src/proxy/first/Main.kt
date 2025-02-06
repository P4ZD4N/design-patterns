package proxy.first

fun main() {

    val savedGames: MutableList<SavedGame> = loadSavedGames()

    for (savedGame in savedGames) {
        if (savedGame is SavedGameProxy) {
            println(savedGame.name)
        }

        if (savedGame is SavedGameFull) {
            println(savedGame.name)
        }
    }
}

fun loadSavedGames(): MutableList<SavedGame> {

    val savedGamesCount = 20
    val savedGames: MutableList<SavedGame> = mutableListOf()

    for (i in 1..savedGamesCount) {
        val sg = SavedGameProxy()
        sg.initialize()
        savedGames.add(sg)
    }

    return savedGames
}