package factory.second.units

class BlueFactory : Factory() {

    override fun createInfantryUnit(unitType: UnitType): InfantryUnit {
        when (unitType) {
            UnitType.RIFLEMAN -> return Rifleman(25, 0, 5)
            else -> throw UnsupportedOperationException()
        }
    }

    override fun createMechanizedUnit(unitType: UnitType): MechanizedUnit {
        when (unitType) {
            UnitType.TANK -> return Tank(100, 0, 25)
            else -> throw UnsupportedOperationException()
        }
    }

    override fun createAirUnit(unitType: UnitType): AirUnit {
        when (unitType) {
            UnitType.HELICOPTER -> return Helicopter(80, 0 , 20)
            else -> throw UnsupportedOperationException()
        }
    }
}