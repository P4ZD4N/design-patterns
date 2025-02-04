package command.second.command

import command.second.MusicPlayer

class PlayRandomTrackCommand(private val musicPlayer: MusicPlayer) : MusicPlayerCommand {

    override fun play() {
        musicPlayer.playRandomTrack()
    }
}