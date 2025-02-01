package template_method.first

open class ClassicCarStartingSequence : CarStartingSequence() {

    override fun startTheIgnition() {
        println("Turn the key")
    }

    override fun setTheGear() {
        println("Choose gear")
    }
}