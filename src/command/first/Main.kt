package command.first

import command.first.command.*

fun main() {

    val robot = Robot()
    val workshopApp = WorkshopApp()

    workshopApp.addToQueue(RobotTurnOnCommand(robot))
    workshopApp.addToQueue(RobotCutCommand(robot))
    workshopApp.addToQueue(RobotDrillCommand(robot))
    workshopApp.addToQueue(RobotTurnOffCommand(robot))

    workshopApp.run()
    workshopApp.run()

    val coffeeMaker = CoffeeMaker()
    workshopApp.addToQueue(CoffeeMakerTurnOnCommand(coffeeMaker))
    workshopApp.addToQueue(CoffeeMakerTurnOffCommand(coffeeMaker))

    workshopApp.run()
    workshopApp.run()

//    workshopApp.addToQueue(RobotTurnOnCommand(robot))
//    workshopApp.run()
//    workshopApp.undoLastCommand()
}