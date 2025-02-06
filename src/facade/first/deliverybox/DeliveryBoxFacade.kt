package facade.first.deliverybox

class DeliveryBoxFacade {

    private val deliveryBox: DeliveryBox = DeliveryBox()
    private val deliveryBoxSystem: DeliveryBoxSystem = DeliveryBoxSystem()

    fun pickupPackage() {
        deliveryBox.getUserData()
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox()
        }
    }
}