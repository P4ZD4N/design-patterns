package command.second.command

import command.second.MusicPlayer

class PlayFirstTrackCommand(private val musicPlayer: MusicPlayer) : MusicPlayerCommand {

    override fun play() {
        musicPlayer.playFirstTrack()
    }
}