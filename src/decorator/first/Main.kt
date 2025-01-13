package decorator.first

fun main() {

    val plain = Plain()
    val forestHill = Hill()
    val swampHill = SwampDecorator(Hill())
    val swampForestPlain = SwampDecorator(ForestDecorator(Plain()))
    val roadHill = RoadDecorator(Hill())

    println("Swamp hill cost: " + swampHill.getFuelCost())
    println("Swamp forest plain cost: " + swampForestPlain.getFuelCost())
    println("Hill road cost: " + roadHill.getFuelCost())
    println("Hill road description: " + roadHill.getDescription())
}