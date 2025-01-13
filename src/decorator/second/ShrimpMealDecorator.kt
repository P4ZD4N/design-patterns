package decorator.second

class ShrimpMealDecorator(private val decoratedMeal: Meal) : MealDecorator(decoratedMeal) {

    private fun addShrimp() {
        println("Adding shrimp to meal...")
    }

    override fun prepareMeal() {
        decoratedMeal.prepareMeal()
        addShrimp()
    }
}