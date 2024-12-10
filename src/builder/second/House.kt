package builder.second

class House {

    var walls: String = ""
    var floors: String = ""
    var rooms: String = ""

    override fun toString(): String {
        return "House(walls='$walls', floors='$floors', rooms='$rooms')"
    }
}