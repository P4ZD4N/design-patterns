package facade.second.atmmachine

class AtmMachineFacade {

    private val atmMachine: AtmMachine = AtmMachine()
    private val bankSystem: BankSystem = BankSystem()

    fun withdrawMoney() {
        atmMachine.enterPin()
        if (bankSystem.isPinValid() && bankSystem.isTransactionValid()) {
            atmMachine.withdrawCash()
        }
    }
}