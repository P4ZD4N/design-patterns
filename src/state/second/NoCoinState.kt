package state.second

class NoCoinState : State {
    override fun insertCoin(gameMachine: GameMachine) {
        println("Coin inserted successfully!")
        gameMachine.state = CoinInsertedState()
    }

    override fun pressTheButton(gameMachine: GameMachine) {
        println("Firstly insert coin!")
    }

    override fun collectYourWinnings(gameMachine: GameMachine) {
        println("Firstly insert coin!")
    }

    override fun printCurrentState(gameMachine: GameMachine) {
        println("NO COIN")
    }
}