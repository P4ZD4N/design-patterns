package observer.first.notification

import observer.first.order.Order

interface Observer {

    fun update(order: Order)
}