package factory.first.units

abstract class Factory {
    abstract fun createUnit(unitType: UnitType): Unit
}