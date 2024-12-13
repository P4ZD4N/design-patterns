package factory.second.units

abstract class Factory {
    abstract fun createInfantryUnit(unitType: UnitType): InfantryUnit
    abstract fun createMechanizedUnit(unitType: UnitType): MechanizedUnit
    abstract fun createAirUnit(unitType: UnitType): AirUnit
}