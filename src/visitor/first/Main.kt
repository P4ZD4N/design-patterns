package visitor.first

import visitor.first.activity.Activity
import visitor.first.activity.Squash
import visitor.first.activity.Treadmill
import visitor.first.activity.Weights
import visitor.first.visitor.VisitorImpl

fun main() {

    val treadmill = Treadmill(200)
    val squash = Squash(45)
    val weights = Weights(50, 10)
    val visitor = VisitorImpl()

    treadmill.accept(visitor)
    squash.accept(visitor)
    weights.accept(visitor)

    println()

    val activities: MutableList<Activity> = mutableListOf(treadmill, squash, weights)

    for (activity in activities) {
        activity.accept(visitor)
    }
}