package builder.second

class BigHouseBuilder : HouseBuilder {

    private val house: House = House();

    override fun buildWalls() {
        house.walls = "big walls";
    }

    override fun buildFloors() {
        house.floors = "big floors";
    }

    override fun buildRooms() {
        house.rooms = "big rooms";
    }

    override fun getHouse(): House {
        return house
    }
}