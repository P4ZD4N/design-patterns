package state.first

class CoffeeMachine {

    var state: State = NoCoinState()

    fun insertTheCoin() {
        state.insertTheCoin(this)
    }

    fun pushTheButton() {
        state.pushTheButton(this)
    }

    fun takeTheCup() {
        state.takeTheCup(this)
    }

    fun returnTheCoin() {
        state.returnTheCoin(this)
    }
}