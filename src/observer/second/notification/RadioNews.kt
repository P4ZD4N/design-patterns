package observer.second.notification

import observer.second.weatherforecast.WeatherForecast

class RadioNews : Observer {

    override fun updateForecast(weatherForecast: WeatherForecast) {
        println(
            "Radio: New weather forecast: temperature: ${weatherForecast.temperature}^C pressure: ${weatherForecast.pressure}hPa")
    }
}