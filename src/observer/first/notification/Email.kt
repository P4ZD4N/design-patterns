package observer.first.notification

import observer.first.order.Order

class Email : Observer {

    override fun update(order: Order) {
        println("Email: Order number: ${order.orderNumber} changed status to: ${order.orderStatus}")
    }
}