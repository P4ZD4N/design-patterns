package chain_of_responsibility.third

class Anna : Child() {

    override fun processRequest(motherRequest: MotherRequest) {
        if (motherRequest.shelf == Shelf.LOW) {
            println("Anna reached jar from shelf!")
        } else tallerChild.processRequest(motherRequest)
    }
}