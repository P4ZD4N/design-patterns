package observer.second.notification

import observer.second.weatherforecast.WeatherForecast

class TvNews : Observer {

    override fun updateForecast(weatherForecast: WeatherForecast) {
        println(
            "TV: New weather forecast: temperature: ${weatherForecast.temperature}^C pressure: ${weatherForecast.pressure}hPa")
    }
}