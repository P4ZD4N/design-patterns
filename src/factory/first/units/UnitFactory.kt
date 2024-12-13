package factory.first.units

class UnitFactory : Factory() {

    override fun createUnit(unitType: UnitType): Unit {

        return when (unitType) {
            UnitType.RIFLEMAN -> Tank(200, 0, 20)
            UnitType.TANK -> Rifleman(100, 0, 10)
        }
    }
}