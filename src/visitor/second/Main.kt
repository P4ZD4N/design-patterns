package visitor.second

import java.util.*


fun main() {

    val animal = Animal("dog", 30)
    val person = Person("Wiktor", "Chudy", true)
    val shipment = Shipment("PL", "4325452", false)
    val transportableList = mutableListOf(animal, person, shipment)

    val nameTransportVisitor = NameTransportVisitor()
    val priceTransportVisitor = PriceTransportVisitor()

    for (transportable in transportableList) {
        transportable.accept(priceTransportVisitor)
    }

    for (transportable in transportableList) {
        transportable.accept(nameTransportVisitor)
    }
}