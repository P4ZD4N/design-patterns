package observer.first

import observer.first.notification.Email
import observer.first.notification.MobileApp
import observer.first.notification.TextMessage
import observer.first.order.Order
import observer.first.order.OrderStatus

fun main() {
    val order = Order(1, OrderStatus.REGISTERED)
    val textMessage = TextMessage()
    val mobileApp = MobileApp()
    val email = Email()

    order.registerObserver(textMessage)
    order.registerObserver(mobileApp)
    order.registerObserver(email)

    order.notifyObservers()

    order.changeOrderStatus(OrderStatus.SENT)

    order.unregisterObserver(email)

    order.changeOrderStatus(OrderStatus.RECEIVED)
}