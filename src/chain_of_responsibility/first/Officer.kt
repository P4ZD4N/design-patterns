package chain_of_responsibility.first

class Officer() {

    var sergeant: Boolean = false;
    var captain: Boolean = false;
    var general: Boolean = false;

    fun receiveMessage(message: Message) {
        if (sergeant) {
            println("Sergeant received message: ${message.content}");
        } else if (captain) {
            println("Captain received message: ${message.content}")
        } else if (general) {
            println("General received message: ${message.content}")
        } else {
            println("Wrong recipient of message!")
        }
    }
}