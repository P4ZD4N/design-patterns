package state.second

class CoinInsertedState : State {
    override fun insertCoin(gameMachine: GameMachine) {
        println("Coin was already inserted!")
    }

    override fun pressTheButton(gameMachine: GameMachine) {
        println("Button pressed successfully!")
        gameMachine.state = ResultState()
    }

    override fun collectYourWinnings(gameMachine: GameMachine) {
        println("Firstly press the button!")
    }

    override fun printCurrentState(gameMachine: GameMachine) {
        println("COIN INSERTED")
    }
}