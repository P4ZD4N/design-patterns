package strategy.first

class Chef(private val name: String) {

    lateinit var eggCooker: EggCooker

    fun cook() {
        eggCooker.cookEgg()
    }
}