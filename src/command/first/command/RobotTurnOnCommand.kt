package command.first.command

import command.first.Robot

class RobotTurnOnCommand(private val robot: Robot) : Command {

    override fun execute() {
        robot.turnOn()
    }

    override fun undo() {
        robot.turnOff()
    }
}