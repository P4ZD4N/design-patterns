package memento.second

import memento.second.operating_system.OperatingSystem
import memento.second.operating_system.OperatingSystemCaretaker

fun main() {

    val operatingSystemCaretaker = OperatingSystemCaretaker()
    val operatingSystem = OperatingSystem()

    operatingSystem.createBackup()
    Thread.sleep(3000)
    operatingSystem.createBackup()
    Thread.sleep(3000)
    operatingSystemCaretaker.addMemento(operatingSystem.save())
    operatingSystem.createBackup()
    Thread.sleep(3000)
    operatingSystem.createBackup()
    Thread.sleep(3000)
    operatingSystem.load(operatingSystemCaretaker.getMemento(0))
}