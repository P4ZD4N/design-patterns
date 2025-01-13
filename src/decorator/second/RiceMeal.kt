package decorator.second

class RiceMeal : Meal() {

    override fun prepareMeal() {
        println("Preparing rice meal...")
    }
}