package command.first.command

import command.first.Robot

class RobotTurnOffCommand(private val robot: Robot) : Command {

    override fun execute() {
        robot.turnOff()
    }

    override fun undo() {
        robot.turnOn()
    }
}