package flyweight.first

class UnitStatsRepository private constructor() {

    companion object {

        private val destroyerStats = UnitStats("Destroyer", 100, 15, 10)
        private val riflemanStats = UnitStats("Rifleman", 25, 5, 5);
        private val tankStats = UnitStats("Tank", 110, 15, 5)

        fun getDestroyerStats(): UnitStats {
            return destroyerStats
        }

        fun getRiflemanStats(): UnitStats {
            return riflemanStats
        }

        fun getTankStats(): UnitStats {
            return tankStats;
        }
    }
}