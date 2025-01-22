package chain_of_responsibility.second

fun main() {

    val message = Message("Attack!", 20, OfficerRank.GENERAL)

    val sergeant = Sergeant()
    val captain = Captain()
    val general = General()

    sergeant.superiorOfficer = captain
    captain.superiorOfficer = general

    sergeant.processMessage(message)
}