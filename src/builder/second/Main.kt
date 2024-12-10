package builder.second

fun main() {
    val smallHouseBuilder = SmallHouseBuilder()
    val bigHouseBuilder = BigHouseBuilder()

    val smallHouseDirector = HouseDirector(smallHouseBuilder)
    smallHouseDirector.buildHouse()

    val bigHouseDirector = HouseDirector(bigHouseBuilder)
    bigHouseDirector.buildHouse()

    val smallHouse = smallHouseDirector.getHouse()
    val bigHouse = bigHouseDirector.getHouse()

    println(smallHouse)
    println(bigHouse)
}