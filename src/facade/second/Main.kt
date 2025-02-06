package facade.second

import facade.second.atmmachine.AtmMachineFacade

fun main() {

    val atmMachineFacade = AtmMachineFacade()
    atmMachineFacade.withdrawMoney()
}