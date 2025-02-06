package visitor.first.visitor

import visitor.first.activity.Squash
import visitor.first.activity.Treadmill
import visitor.first.activity.Weights

class VisitorImpl : Visitor {

    override fun visit(treadmill: Treadmill) {
        println("Calories burned running on treadmill: ${treadmill.distance * 5}")
    }

    override fun visit(weights: Weights) {
        println("Calories burned lifting weights: ${weights.weight * weights.reps * 2}")
    }

    override fun visit(squash: Squash) {
        println("Calories burned playing squash: ${squash.minutesPlayed * 20}")
    }
}