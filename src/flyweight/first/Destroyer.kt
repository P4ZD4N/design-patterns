package flyweight.first

class Destroyer(
    private val x: Int,
    private val y: Int
) : Unit {
    private val stats: UnitStats = UnitStatsRepository.getDestroyerStats()
    private val hpLeft = stats.hp
}