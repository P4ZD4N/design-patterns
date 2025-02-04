package command.first.command

import command.first.CoffeeMaker

class CoffeeMakerTurnOffCommand(private val coffeeMaker: CoffeeMaker) : Command {

    override fun execute() {
        coffeeMaker.turnOff()
    }

    override fun undo() {
        coffeeMaker.turnOn()
    }
}