package visitor.second

interface Transportable {

    fun accept(transportVisitor: TransportVisitor)
}