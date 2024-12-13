package factory.first

import factory.first.units.Tank
import factory.first.units.UnitFactory
import factory.first.units.UnitType

fun main() {
    val factory: UnitFactory = UnitFactory();

    val tank = factory.createUnit(UnitType.TANK)
    val rifleman = factory.createUnit(UnitType.RIFLEMAN)
    val tank1 = Tank(100, 0 ,20)
}