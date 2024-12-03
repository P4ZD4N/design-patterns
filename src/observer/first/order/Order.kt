package observer.first.order

import observer.first.notification.Observer

class Order(
    val orderNumber: Long,
    var orderStatus: OrderStatus
) : Observable {

    private val registeredObservers: MutableSet<Observer> = mutableSetOf()

    override fun registerObserver(observer: Observer) {
        registeredObservers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        registeredObservers.remove(observer)
    }

    override fun notifyObservers() {
        registeredObservers.forEach { observer ->
            observer.update(this)
        }
    }

    fun changeOrderStatus(orderStatus: OrderStatus) {
        this.orderStatus = orderStatus;
        notifyObservers()
    }
}