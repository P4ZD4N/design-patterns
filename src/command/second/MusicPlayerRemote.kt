package command.second

import command.second.command.MusicPlayerCommand

class MusicPlayerRemote {

    lateinit var musicPlayerCommand: MusicPlayerCommand

    fun pressButton() {
        musicPlayerCommand.play()
    }
}