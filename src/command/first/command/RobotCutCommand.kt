package command.first.command

import command.first.Robot

class RobotCutCommand(private val robot: Robot) : Command {

    override fun execute() {
        robot.cut()
    }

    override fun undo() {}
}