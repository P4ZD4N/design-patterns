package factory.third

class Ford(engineCapacity: Double,
           fuelType: FuelType,
           productionYear: Int
) : Car(engineCapacity, fuelType, productionYear) {

    private var steeringWheelPosition: String = ""

    override fun getSteeringWheelPosition(): String {
        return steeringWheelPosition
    }

    override fun setSteeringWheelPosition(position: String) {
        steeringWheelPosition = position
    }
}