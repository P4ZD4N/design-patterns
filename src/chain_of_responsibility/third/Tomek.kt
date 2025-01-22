package chain_of_responsibility.third

class Tomek : Child() {

    override fun processRequest(motherRequest: MotherRequest) {
        if (motherRequest.shelf == Shelf.MEDIUM) {
            println("Tomek reached jar from shelf!")
        } else tallerChild.processRequest(motherRequest)
    }
}