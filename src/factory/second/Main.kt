package factory.second

import factory.second.units.Factory
import factory.second.units.BlueFactory
import factory.second.units.UnitType

fun main() {
    val blueFactory: Factory = BlueFactory()
    val redFactory: Factory = BlueFactory()

    val blueTank = blueFactory.createMechanizedUnit(UnitType.TANK)
    val blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN)
    val blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER)

    val redTank = redFactory.createMechanizedUnit(UnitType.TANK)
    val redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN)
    val redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER)
}