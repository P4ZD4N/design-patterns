package decorator.first

abstract class Terrain(
    private val description: String,
    private val fuelCost: Int
) {
    open fun getFuelCost(): Int {
        return fuelCost
    }

    open fun getDescription(): String {
        return description
    }
}
