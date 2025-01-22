package chain_of_responsibility.second

abstract class Officer {

    lateinit var superiorOfficer: Officer

    abstract fun processMessage(message: Message)
}