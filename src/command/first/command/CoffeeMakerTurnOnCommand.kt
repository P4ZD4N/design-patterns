package command.first.command

import command.first.CoffeeMaker

class CoffeeMakerTurnOnCommand(private val coffeeMaker: CoffeeMaker) : Command {

    override fun execute() {
        coffeeMaker.turnOn()
    }

    override fun undo() {
        coffeeMaker.turnOff()
    }
}