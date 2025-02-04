package command.second.command

import command.second.MusicPlayer

class PlayNextTrackCommand(private val musicPlayer: MusicPlayer) : MusicPlayerCommand {

    override fun play() {
        musicPlayer.playNextTrack()
    }
}