package chain_of_responsibility.second

class Sergeant : Officer() {

    companion object {
        const val CODE = 10
        const val NAME = "Kowalski"
    }

    override fun processMessage(message: Message) {
        if (message.officerRank == OfficerRank.SERGEANT && message.code == CODE) {
            println("$NAME received message: ${message.content}")
        } else superiorOfficer.processMessage(message)
    }
}