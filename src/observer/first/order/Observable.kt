package observer.first.order

import observer.first.notification.Observer

interface Observable {

    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObservers()
}