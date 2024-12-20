package factory.fourth

class CarFactory : Factory() {

    override fun createCar(carBrand: CarBrand): Car {
        return when (carBrand) {
            CarBrand.BMW -> BMW(3.0, FuelType.DIESEL, 2009)
            CarBrand.FORD -> Ford(2.0, FuelType.PETROL, 2007)
        }
    }
}