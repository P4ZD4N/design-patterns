package state.second

class GameMachine {

    var state: State = NoCoinState()

    fun insertCoin() {
        state.insertCoin(this)
    }

    fun pressTheButton() {
        state.pressTheButton(this)
    }

    fun collectYourWinnings() {
        state.collectYourWinnings(this)
    }

    fun printCurrentState() {
        state.printCurrentState(this)
    }
}