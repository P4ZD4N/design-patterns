package adapter.first

class TwoWayAdapter(
    private val ukDevice: UKDevice,
    private val continentalDevice: ContinentalDevice
) : UKDevice, ContinentalDevice {

    override fun on() {
        ukDevice.on()
    }

    override fun powerOn() {
        continentalDevice.powerOn()
    }
}