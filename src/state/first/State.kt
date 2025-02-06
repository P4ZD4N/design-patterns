package state.first

interface State {

    fun insertTheCoin(coffeeMachine: CoffeeMachine)
    fun pushTheButton(coffeeMachine: CoffeeMachine)
    fun takeTheCup(coffeeMachine: CoffeeMachine)
    fun returnTheCoin(coffeeMachine: CoffeeMachine)
}