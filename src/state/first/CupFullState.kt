package state.first

class CupFullState : State {

    override fun insertTheCoin(coffeeMachine: CoffeeMachine) {
        println("Get cup firstly!")
    }

    override fun pushTheButton(coffeeMachine: CoffeeMachine) {
        println("Take a cup firstly!")
    }

    override fun takeTheCup(coffeeMachine: CoffeeMachine) {
        println("Cup took successfully!")
        coffeeMachine.state = NoCoinState()
    }

    override fun returnTheCoin(coffeeMachine: CoffeeMachine) {
        println("Too late!")
    }
}