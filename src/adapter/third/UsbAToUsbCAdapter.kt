package adapter.third

class UsbAToUsbCAdapter(private val usbADevice: UsbAMouse) : UsbC {

    override fun connect() {
        println("Adapter: Adapter connected to USB-C port")
        usbADevice.connect()
    }
}