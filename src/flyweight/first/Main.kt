package flyweight.first

fun main() {

    val activeUnits: MutableList<Unit> = mutableListOf()

    for (i in 0..10000000) {
        activeUnits.add(Tank(124, 10))
        activeUnits.add(Rifleman(10, 10))
        activeUnits.add(Destroyer(54, 24))
    }
}