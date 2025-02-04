package memento.first.smart_app

class SmartAppCaretaker {

    private val mementos: MutableList<SmartAppMemento> = mutableListOf()

    fun addMemento(smartAppMemento: SmartAppMemento) {
        mementos.add(smartAppMemento)
        println("Saved version: ${smartAppMemento.version} is on ${mementos.size - 1} index")
    }

    fun getMemento(index: Int): SmartAppMemento {
        println("Loaded version: ${mementos[index].version}")
        return mementos[index]
    }
}