package facade.first.deliverybox

internal class DeliveryBox {

    fun isDeliveryBoxFull(): Boolean {
        println("Delivery Box is not full!")
        return false
    }

    fun isDeliveryBoxBroken(): Boolean {
        println("Delivery Box is not broken!")
        return false
    }

    fun getUserData() {
        println("Used data entered!")
    }

    fun openBox() {
        println("Box opened!")
    }
}