package command.second

import command.second.command.PlayFirstTrackCommand
import command.second.command.PlayNextTrackCommand
import command.second.command.PlayRandomTrackCommand


fun main() {
    val musicPlayer = MusicPlayer()
    val remote = MusicPlayerRemote()

    remote.musicPlayerCommand = PlayFirstTrackCommand(musicPlayer)
    remote.pressButton()

    remote.musicPlayerCommand = PlayNextTrackCommand(musicPlayer)
    remote.pressButton()
    remote.pressButton()
    remote.pressButton()
    remote.pressButton()
    remote.pressButton()
    remote.pressButton()

    remote.musicPlayerCommand = PlayRandomTrackCommand(musicPlayer)
    remote.pressButton()
    remote.pressButton()
}