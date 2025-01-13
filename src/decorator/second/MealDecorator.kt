package decorator.second

open class MealDecorator(private val decoratedMeal: Meal) : Meal() {

    override fun prepareMeal() {
        decoratedMeal.prepareMeal()
    }
}