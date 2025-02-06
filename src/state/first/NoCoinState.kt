package state.first

class NoCoinState : State {

    override fun insertTheCoin(coffeeMachine: CoffeeMachine) {
        println("Coin inserted successfully!")
        coffeeMachine.state = CoinInsertedState()
    }

    override fun pushTheButton(coffeeMachine: CoffeeMachine) {
        println("Insert coin firstly!")
    }

    override fun takeTheCup(coffeeMachine: CoffeeMachine) {
        println("Insert coin firstly!")
    }

    override fun returnTheCoin(coffeeMachine: CoffeeMachine) {
        println("Insert coin firstly!")
    }
}