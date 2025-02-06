package facade.first.deliverybox

internal class DeliveryBoxSystem {

    fun sendNotification() {
        println("Text message sent to the client!")
    }

    fun isPaymentSecured(): Boolean {
        println("Payment has been secured!")
        return true
    }

    fun isUserDataValidated(): Boolean {
        println("User data has been validated!")
        return true
    }

    fun scheduleDelivery() {
        println("Delivery has been scheduled!")
    }
}