package chain_of_responsibility.first

fun main() {

    val message = Message("Attack!")
    val officer = Officer()
    officer.captain = true
    officer.sergeant = true
    officer.receiveMessage(message)
}