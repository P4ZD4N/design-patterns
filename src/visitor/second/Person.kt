package visitor.second

class Person(var firstName: String, var lastName: String, var isRegularCustomer: Boolean) : Transportable {

    override fun accept(transportVisitor: TransportVisitor) {
        transportVisitor.visit(this)
    }
}