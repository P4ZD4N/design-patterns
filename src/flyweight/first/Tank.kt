package flyweight.first

class Tank (
    private val x: Int,
    private val y: Int
) : Unit {
    private val stats: UnitStats = UnitStatsRepository.getTankStats()
    private val hpLeft = stats.hp
}