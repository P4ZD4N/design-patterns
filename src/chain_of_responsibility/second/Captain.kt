package chain_of_responsibility.second

class Captain : Officer() {

    companion object {
        const val CODE = 20
        const val NAME = "Rokowski"
    }

    override fun processMessage(message: Message) {
        if (message.officerRank == OfficerRank.CAPTAIN && message.code == CODE) {
            println("$NAME received message: ${message.content}")
        } else println("Wrong message recipient or code!")
    }
}