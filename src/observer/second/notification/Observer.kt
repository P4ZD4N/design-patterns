package observer.second.notification

import observer.second.weatherforecast.WeatherForecast

interface Observer {

    fun updateForecast(weatherForecast: WeatherForecast)
}