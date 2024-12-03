package observer.second.weatherforecast

import observer.second.notification.Observer

class WeatherForecast(
    var temperature: Long,
    var pressure: Number
) : Observable {

    private var registeredObservers: MutableSet<Observer> = mutableSetOf()

    override fun registerObserver(observer: Observer) {
        registeredObservers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        registeredObservers.remove(observer)
    }

    override fun notifyObservers() {
        registeredObservers.forEach { observer ->
            observer.updateForecast(this)
        }
    }

    fun updateForecast(temperature: Long, pressure: Number) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers()
    }
}