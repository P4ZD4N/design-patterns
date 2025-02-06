package visitor.second

class PriceTransportVisitor : TransportVisitor {

    override fun visit(animal: Animal) {
        val price = animal.weight * 0.2

        println("Price per kilometer for an animal: $price PLN")
    }

    override fun visit(person: Person) {
        var price = 6

        if (person.isRegularCustomer) price /= 2

        println("Price per kilometer for a person: $price PLN")
    }

    override fun visit(shipment: Shipment) {
        var price = 2

        if (shipment.isLarge) price *= 3

        println("Price per kilometer for a shipment: $price PLN")
    }
}