package builder.second

class SmallHouseBuilder : HouseBuilder {

    private val house: House = House();

    override fun buildWalls() {
        house.walls = "small walls";
    }

    override fun buildFloors() {
        house.floors = "small floors";
    }

    override fun buildRooms() {
        house.rooms = "small rooms";
    }

    override fun getHouse(): House {
        return house
    }
}