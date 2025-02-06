package visitor.first.activity

import visitor.first.visitor.Visitor

class Squash(val minutesPlayed: Int) : Activity {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}