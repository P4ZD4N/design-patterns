package visitor.second

interface TransportVisitor {

    fun visit(animal: Animal)
    fun visit(person: Person)
    fun visit(shipment: Shipment)
}