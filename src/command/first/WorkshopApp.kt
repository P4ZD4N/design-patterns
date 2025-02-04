package command.first

import command.first.command.Command

class WorkshopApp {

    private val commandQueue: MutableList<Command> = mutableListOf()

    fun addToQueue(command: Command) {
        commandQueue.add(command)
    }

    fun run() {

        if (commandQueue.isEmpty()) {
            println("Queue does not contain any commands!")
            return
        }

        for (command in commandQueue)
            command.execute()

        commandQueue.clear()
    }

//    fun undoLastCommand() {
//        for (command in commandQueue)
//            command.undo()
//    }
}