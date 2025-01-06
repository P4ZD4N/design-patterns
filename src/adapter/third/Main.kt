package adapter.third

fun main() {
    val laptop = Laptop()
    val usbAMouse = UsbAMouse()
    val adapter = UsbAToUsbCAdapter(usbAMouse)

    laptop.checkConnection()
    laptop.connectDevice(adapter)
    laptop.checkConnection()
}