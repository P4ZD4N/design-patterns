package chain_of_responsibility.third

class Antek : Child() {

    override fun processRequest(motherRequest: MotherRequest) {
        if (motherRequest.shelf == Shelf.HIGH) {
            println("Antek reached jar from shelf!")
        } else println("Wrong shelf!")
    }
}