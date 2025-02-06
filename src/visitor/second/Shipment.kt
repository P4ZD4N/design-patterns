package visitor.second

class Shipment(var prefix: String, var serialNumber: String, var isLarge: Boolean) : Transportable {

    override fun accept(transportVisitor: TransportVisitor) {
        transportVisitor.visit(this)
    }
}