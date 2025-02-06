package state.first

class CoinInsertedState : State {

    override fun insertTheCoin(coffeeMachine: CoffeeMachine) {
        println("Coin was already inserted!")
    }

    override fun pushTheButton(coffeeMachine: CoffeeMachine) {
        println("Fulling cup!")
        coffeeMachine.state = CupFullState()
    }

    override fun takeTheCup(coffeeMachine: CoffeeMachine) {
        println("Press the button!")
    }

    override fun returnTheCoin(coffeeMachine: CoffeeMachine) {
        println("Returning coin!")
        coffeeMachine.state = NoCoinState()
    }
}