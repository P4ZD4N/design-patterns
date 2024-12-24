package adapter.first

fun main() {

    val continentalSocket = ContinentalSocket()
    val ukSocket = UKSocket()

    val ukRadio = object : UKDevice {
        override fun on() {
            println("English music plays...")
        }
    }

    val continentalRadio = object : ContinentalDevice {
        override fun powerOn() {
            println("Continental music plays...")
        }
    }

    val adapter = TwoWayAdapter(ukRadio, continentalRadio)
    continentalSocket.plugIn(adapter)
    ukSocket.plugIn(adapter)
}