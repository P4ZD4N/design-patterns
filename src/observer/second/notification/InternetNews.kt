package observer.second.notification

import observer.second.weatherforecast.WeatherForecast

class InternetNews : Observer {

    override fun updateForecast(weatherForecast: WeatherForecast) {
        println(
            "Internet: New weather forecast: temperature: ${weatherForecast.temperature}^C pressure: ${weatherForecast.pressure}hPa")
    }
}