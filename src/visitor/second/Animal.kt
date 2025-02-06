package visitor.second

class Animal(var kind: String, var weight: Int) : Transportable {

    override fun accept(transportVisitor: TransportVisitor) {
        transportVisitor.visit(this)
    }
}