package factory.third

fun main() {
    val commonwealthFactory: Factory = CommonwealthFactory()
    val continentalFactory: Factory = ContinentalFactory()

    val bmw: Car = commonwealthFactory.buildBMW(BMWModel.E60)
    println(bmw.getSteeringWheelPosition())

    val ford1: Car = continentalFactory.buildFord(FordModel.CMAX)
    println(ford1.getSteeringWheelPosition())

    val ford2: Car = commonwealthFactory.buildFord(FordModel.Focus)
    println(ford2.getSteeringWheelPosition())
}