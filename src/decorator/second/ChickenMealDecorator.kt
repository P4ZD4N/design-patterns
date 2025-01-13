package decorator.second

class ChickenMealDecorator(private val decoratedMeal: Meal) : MealDecorator(decoratedMeal) {

    private fun addChicken() {
        println("Adding chicken to meal...")
    }

    override fun prepareMeal() {
        decoratedMeal.prepareMeal()
        addChicken()
    }
}