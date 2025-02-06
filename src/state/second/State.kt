package state.second

interface State {

    fun insertCoin(gameMachine: GameMachine)
    fun pressTheButton(gameMachine: GameMachine)
    fun collectYourWinnings(gameMachine: GameMachine)
    fun printCurrentState(gameMachine: GameMachine)
}