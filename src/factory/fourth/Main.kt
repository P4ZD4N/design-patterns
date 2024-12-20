package factory.fourth

fun main() {
    val factory = CarFactory()

    val bmw = factory.createCar(CarBrand.BMW)
    val ford = factory.createCar(CarBrand.FORD)
}