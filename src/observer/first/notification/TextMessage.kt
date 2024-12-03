package observer.first.notification

import observer.first.order.Order

class TextMessage : Observer {

    override fun update(order: Order) {
        println("SMS: Order number: ${order.orderNumber} changed status to: ${order.orderStatus}")
    }
}