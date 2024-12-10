package builder.second

class HouseDirector(private val houseBuilder: HouseBuilder) {

    fun buildHouse() {
        houseBuilder.buildWalls()
        houseBuilder.buildFloors()
        houseBuilder.buildRooms()
    }

    fun getHouse(): House {
        return this.houseBuilder.getHouse()
    }
}