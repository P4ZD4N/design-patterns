package memento.second.operating_system

class OperatingSystemCaretaker {

    private val mementos: MutableList<OperatingSystemMemento> = mutableListOf()

    fun addMemento(operatingSystemMemento: OperatingSystemMemento) {
        mementos.add(operatingSystemMemento)
        println("Saved backup with number: ${operatingSystemMemento.backupNumber} on ${mementos.size - 1} index")
    }

    fun getMemento(index: Int): OperatingSystemMemento {
        println("Loaded backup with number: ${mementos[index].backupNumber}")
        return mementos[index]
    }
}