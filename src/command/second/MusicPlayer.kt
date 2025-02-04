package command.second

class MusicPlayer {

    private val tracks: MutableList<String> = mutableListOf("Chin Check", "Candy Shop", "Gin N Juice", "Still D.R.E.", "Xxplosive")
    private var currentTrackNumber = 0

    fun playFirstTrack() {
        println("Playing first track: " + tracks[0])
    }

    fun playNextTrack() {
        currentTrackNumber++
        if (currentTrackNumber > 4) currentTrackNumber = 0
        println("Playing next track: ${tracks[currentTrackNumber]}")
    }

    fun playRandomTrack() {
        val randomNumber = (0..4).random()
        println("Playing random track: ${tracks[randomNumber]}")
    }
}