package adapter.third

class Laptop {

    private var usbCPort: UsbC? = null

    fun connectDevice(usbCPort: UsbC) {
        this.usbCPort = usbCPort
        println("Laptop: Connected device through USB-C port")
        usbCPort.connect()
    }

    fun checkConnection() {
        if (usbCPort == null) {
            println("Laptop: USB-C port is not connected")
            return
        }

        println("Laptop: USB-C port is already connected")
    }
}