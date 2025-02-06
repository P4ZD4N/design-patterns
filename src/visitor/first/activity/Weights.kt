package visitor.first.activity

import visitor.first.visitor.Visitor

class Weights(val weight: Int, val reps: Int) : Activity {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}