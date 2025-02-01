package template_method.first

abstract class CarStartingSequence {

    final fun startTheCar() {
        fastenSeatbelts()
        startTheIgnition()
        setTheGear()
        go()
    }

    private fun fastenSeatbelts() {
        println("Fasten seatbelts")
    }

    private fun go() {
        println("Push gas pedal")
    }

    abstract fun startTheIgnition()
    abstract fun setTheGear()
}