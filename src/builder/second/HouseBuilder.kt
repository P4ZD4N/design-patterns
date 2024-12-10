package builder.second

interface HouseBuilder {

    fun buildWalls();
    fun buildFloors();
    fun buildRooms();
    fun getHouse(): House;
}