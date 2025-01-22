package chain_of_responsibility.second

class General : Officer() {

    companion object {
        const val CODE = 30
        const val NAME = "Nowak"
    }

    override fun processMessage(message: Message) {
        if (message.officerRank == OfficerRank.GENERAL && message.code == CODE) {
            println("$NAME received message: ${message.content}")
        } else superiorOfficer.processMessage(message)
    }
}