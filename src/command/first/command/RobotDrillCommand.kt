package command.first.command

import command.first.Robot

class RobotDrillCommand(private val robot: Robot) : Command {

    override fun execute() {
        robot.drill()
    }

    override fun undo() {}
}