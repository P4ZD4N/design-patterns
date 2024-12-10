package builder.first

fun main() {
    val house = House.Companion.HouseBuilder()
        .buildWalls("walls")
        .buildFloors("floors")
        .build()

    println(house)
}