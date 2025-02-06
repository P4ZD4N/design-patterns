package visitor.first.visitor

import visitor.first.activity.Squash
import visitor.first.activity.Treadmill
import visitor.first.activity.Weights

interface Visitor {

    fun visit(treadmill: Treadmill)
    fun visit(weights: Weights)
    fun visit(squash: Squash)
}