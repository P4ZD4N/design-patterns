package memento.first.smart_app

class SmartApp {

    private var version: Double? = null

    fun changeVersion(version: Double) {
        this.version = version
        println("New version: ${this.version}")
    }

    fun save(): SmartAppMemento {
        return SmartAppMemento(this.version)
    }

    fun load(smartAppMemento: SmartAppMemento) {
        this.version = smartAppMemento.version
    }
}