package factory.third

class Ford(engineCapacity: Double,
           fuelType: FuelType,
           productionYear: Int,
           private var steeringWheelPosition: SteeringWheelPosition
) : Car(engineCapacity, fuelType, productionYear) {

    override fun getSteeringWheelPosition(): SteeringWheelPosition {
        return steeringWheelPosition
    }
}