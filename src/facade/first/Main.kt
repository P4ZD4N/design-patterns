package facade.first

import facade.first.deliverybox.DeliveryBoxFacade

fun main() {

    val deliveryBoxFacade = DeliveryBoxFacade()
    deliveryBoxFacade.pickupPackage()
}

