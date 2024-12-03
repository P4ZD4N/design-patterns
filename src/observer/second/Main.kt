package observer.second

import observer.second.notification.InternetNews
import observer.second.notification.RadioNews
import observer.second.notification.TvNews
import observer.second.weatherforecast.WeatherForecast


fun main() {
    val weatherForecast = WeatherForecast(25, 1003)
    val radioNews = RadioNews()
    val internetNews = InternetNews()
    val tvNews = TvNews()

    weatherForecast.registerObserver(radioNews)
    weatherForecast.registerObserver(internetNews)
    weatherForecast.registerObserver(tvNews)
    weatherForecast.notifyObservers()
    weatherForecast.unregisterObserver(tvNews)
    weatherForecast.unregisterObserver(radioNews)

    println("New forecast - notification only for internet:")
    weatherForecast.updateForecast(18, 1007)
}