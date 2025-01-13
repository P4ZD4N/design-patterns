package decorator.second

fun main() {
    println("New meal: ")
    val riceMeal: Meal = RiceMeal()
    riceMeal.prepareMeal()

    println("New meal: ")
    val riceMealWithShrimp: Meal = ShrimpMealDecorator(RiceMeal())
    riceMealWithShrimp.prepareMeal()

    println("New meal: ")
    val potatoMealWithChickenAndSauce: Meal = SauceMealDecorator(ChickenMealDecorator(PotatoMeal()))
    potatoMealWithChickenAndSauce.prepareMeal()
}