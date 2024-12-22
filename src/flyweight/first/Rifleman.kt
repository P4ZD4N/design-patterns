package flyweight.first

class Rifleman(
    private val x: Int,
    private val y: Int
) : Unit {
    private val stats = UnitStatsRepository.getRiflemanStats()
    private val hpLeft = stats.hp
}