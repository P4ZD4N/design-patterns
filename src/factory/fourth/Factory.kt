package factory.fourth

abstract class Factory {
    abstract fun createCar(carBrand: CarBrand): Car
}