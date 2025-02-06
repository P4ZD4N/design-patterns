package visitor.first.activity

import visitor.first.visitor.Visitor

class Treadmill(val distance: Int) : Activity {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}