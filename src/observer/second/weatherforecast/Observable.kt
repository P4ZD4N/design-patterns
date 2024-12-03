package observer.second.weatherforecast

import observer.second.notification.Observer

interface Observable {

    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObservers()
}