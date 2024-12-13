package factory.second.units

class RedFactory : Factory() {

    override fun createInfantryUnit(unitType: UnitType): InfantryUnit {
        when (unitType) {
            UnitType.RIFLEMAN -> return Rifleman(20, 0, 7)
            else -> throw UnsupportedOperationException()
        }
    }

    override fun createMechanizedUnit(unitType: UnitType): MechanizedUnit {
        when (unitType) {
            UnitType.TANK -> return Tank(75, 0, 35)
            else -> throw UnsupportedOperationException()
        }
    }

    override fun createAirUnit(unitType: UnitType): AirUnit {
        when (unitType) {
            UnitType.HELICOPTER -> return Helicopter(65, 0 , 25)
            else -> throw UnsupportedOperationException()
        }
    }
}