package template_method.first

class AutomaticTransmissionStartingSequence : ClassicCarStartingSequence() {

    override fun setTheGear() {
        println("Automatically choosing gear")
    }
}