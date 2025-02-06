package visitor.second

class NameTransportVisitor : TransportVisitor {

    override fun visit(animal: Animal) {
        println("Animal kind: ${animal.kind}")
    }

    override fun visit(person: Person) {
        println("Person name: ${person.firstName} ${person.lastName}")
    }

    override fun visit(shipment: Shipment) {
        println("Shipment designation: ${shipment.prefix} ${shipment.serialNumber}")
    }
}