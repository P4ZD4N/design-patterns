package chain_of_responsibility.third

abstract class Child {

    lateinit var tallerChild: Child

    abstract fun processRequest(motherRequest: MotherRequest)
}