package observer.first.notification

import observer.first.order.Order

class MobileApp : Observer {

    override fun update(order: Order) {
        println("Mobile App: Order number: ${order.orderNumber} changed status to: ${order.orderStatus}")
    }
}