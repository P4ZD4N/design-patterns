package template_method.second

open class MyTypicalWeekDay : TypicalWeekDay() {

    override fun work() {
        println("Code another feature...")
    }

    override fun goToWork(typeOfTransport: TypeOfTransport): Int {

        return when(typeOfTransport) {
            TypeOfTransport.ON_FOOT -> 40
            TypeOfTransport.TRAM -> 20
            TypeOfTransport.BIKE -> 25
            TypeOfTransport.CAR -> 15
            else -> throw IllegalArgumentException()
        }
    }
}