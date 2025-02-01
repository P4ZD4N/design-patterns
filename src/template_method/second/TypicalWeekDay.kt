package template_method.second

abstract class TypicalWeekDay {

    final fun everyDayIsExactlyTheSame(typeOfTransport: TypeOfTransport) {
        wakeUp()
        getReady()

        val time = goToWork(typeOfTransport)

        summary(time)
        work()
        goHome()
    }

    private fun goHome() {
        println("Going to home...")
    }

    private fun summary(time: Int) {
        println("Trip to home took $time minutes...")
    }

    private fun getReady() {
        println("Preparing to leave home...")
    }

    private fun wakeUp() {
        println("Waking up...")
    }

    protected abstract fun work()
    protected abstract fun goToWork(typeOfTransport: TypeOfTransport): Int
}