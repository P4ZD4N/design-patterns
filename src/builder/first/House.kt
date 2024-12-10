package builder.first

class House private constructor(private val houseBuilder: HouseBuilder) {

    private var walls: String = ""
    private var floors: String = ""
    private var rooms: String = ""
    private var roof: String = ""
    private var windows: String = ""
    private var doors: String = ""
    private var garage: String = ""

    init {
        walls = houseBuilder.walls
        floors = houseBuilder.floors
        rooms = houseBuilder.rooms
        roof = houseBuilder.roof
        windows = houseBuilder.windows
        doors = houseBuilder.doors
        garage = houseBuilder.garage
    }

    companion object {
        class HouseBuilder {

            var walls: String = ""
            var floors: String = ""
            var rooms: String = ""
            var roof: String = ""
            var windows: String = ""
            var doors: String = ""
            var garage: String = ""

            fun buildWalls(walls: String): HouseBuilder {
                this.walls = walls
                return this
            }

            fun buildFloors(floors: String): HouseBuilder {
                this.floors = floors
                return this
            }

            fun buildRooms(rooms: String): HouseBuilder {
                this.rooms = rooms
                return this
            }

            fun buildRoof(roof: String): HouseBuilder {
                this.roof = roof
                return this
            }

            fun buildWindows(windows: String): HouseBuilder {
                this.windows = windows
                return this
            }

            fun buildDoors(doors: String): HouseBuilder {
                this.doors = doors
                return this
            }

            fun buildGarage(garage: String): HouseBuilder {
                this.garage = garage
                return this
            }

            fun build(): House {
                return House(this);
            }
        }
    }

    override fun toString(): String {
        return "House(walls='$walls', floors='$floors', rooms='$rooms', roof='$roof', windows='$windows', doors='$doors', garage='$garage')"
    }
}