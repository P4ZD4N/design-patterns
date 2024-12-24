package adapter.first

class UKToContinentalAdapter(private val device: UKDevice) : ContinentalDevice {

    override fun powerOn() {
        device.on()
    }
}