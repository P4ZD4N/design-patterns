package state.second

fun main() {

    val gameMachine = GameMachine()

    gameMachine.printCurrentState()

    gameMachine.pressTheButton()
    gameMachine.insertCoin()

    gameMachine.printCurrentState()

    gameMachine.collectYourWinnings()
    gameMachine.pressTheButton()

    gameMachine.printCurrentState()

    gameMachine.collectYourWinnings()

    gameMachine.printCurrentState()
}