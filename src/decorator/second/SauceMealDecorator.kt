package decorator.second

class SauceMealDecorator(private val decoratedMeal: Meal) : MealDecorator(decoratedMeal) {

    private fun addSauce() {
        println("Adding sauce to meal...")
    }

    override fun prepareMeal() {
        decoratedMeal.prepareMeal()
        addSauce()
    }
}