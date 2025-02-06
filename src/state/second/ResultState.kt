package state.second

class ResultState : State {
    override fun insertCoin(gameMachine: GameMachine) {
        println("Coin was already inserted!")
    }

    override fun pressTheButton(gameMachine: GameMachine) {
        println("Button was already pressed!")
    }

    override fun collectYourWinnings(gameMachine: GameMachine) {
        val randomNumber = (1..10).random()

        if (randomNumber < 5) {
            println("You won 100$!")
            gameMachine.state = NoCoinState()
            return
        }

        println("You didn't win anything!")
        gameMachine.state = NoCoinState()
    }

    override fun printCurrentState(gameMachine: GameMachine) {
        println("RESULT")
    }
}