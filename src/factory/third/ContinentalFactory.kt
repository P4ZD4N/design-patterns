package factory.third

class ContinentalFactory : Factory {

    override fun buildBMW(bmwModel: BMWModel): Car {
        when (bmwModel) {
            BMWModel.X5 -> {
                val bmw = BMW(3.0, FuelType.DIESEL, 2009, SteeringWheelPosition.RIGHT)
                return bmw
            }
            BMWModel.E60 -> {
                val bmw = BMW(2.0, FuelType.PETROL, 2007, SteeringWheelPosition.RIGHT)
                return bmw
            }
        }
    }

    override fun buildFord(fordModel: FordModel): Car {
        when (fordModel) {
            FordModel.CMAX -> {
                val ford = Ford(2.0, FuelType.DIESEL, 2005, SteeringWheelPosition.RIGHT)
                return ford
            }
            FordModel.Focus -> {
                val ford = Ford(2.0, FuelType.PETROL, 2007, SteeringWheelPosition.RIGHT)
                return ford
            }
        }
    }
}