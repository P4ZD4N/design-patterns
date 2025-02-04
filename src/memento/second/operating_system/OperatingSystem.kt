package memento.second.operating_system

import java.util.Date

class OperatingSystem {

    private var backupNumber: Int = 0
    private var backupDate: Date? = null

    fun createBackup() {
        backupNumber++;
        backupDate = Date()
        println("Created backup with number '${backupNumber}' and date '${backupDate}'")
    }

    fun save(): OperatingSystemMemento {
        return OperatingSystemMemento(backupNumber, backupDate)
    }

    fun load(operatingSystemMemento: OperatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.backupNumber
        this.backupDate = operatingSystemMemento.backupDate
    }
}