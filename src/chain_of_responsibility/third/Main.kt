package chain_of_responsibility.third

fun main() {
    val motherRequest = MotherRequest(Shelf.HIGH)

    val tomek: Child = Tomek()
    val ania: Child = Anna()
    val antek: Child = Antek()

    ania.tallerChild = tomek
    tomek.tallerChild = antek

    antek.processRequest(motherRequest)
}