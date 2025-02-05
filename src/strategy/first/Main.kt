package strategy.first

fun main() {

    val chef = Chef("Gordon")
    chef.eggCooker = HardBoiledEggCooker()
    chef.cook()

    chef.eggCooker = SoftBoiledEggCooker()
    chef.cook()
}