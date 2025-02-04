package memento.first

import memento.first.smart_app.SmartApp
import memento.first.smart_app.SmartAppCaretaker

fun main() {

    val smartAppCaretaker = SmartAppCaretaker()
    val smartApp = SmartApp()

    smartApp.changeVersion(1.0)
    smartApp.changeVersion(1.1)
    smartApp.changeVersion(1.2)

    smartAppCaretaker.addMemento(smartApp.save())

    smartApp.changeVersion(1.3)
    smartApp.changeVersion(2.0)
    smartApp.changeVersion(2.1)

    smartApp.load(smartAppCaretaker.getMemento(0))
}