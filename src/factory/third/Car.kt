package factory.third

abstract class Car(
    engineCapacity: Double,
    fuelType: FuelType,
    productionYear: Int
) {
    abstract fun getSteeringWheelPosition(): SteeringWheelPosition
}