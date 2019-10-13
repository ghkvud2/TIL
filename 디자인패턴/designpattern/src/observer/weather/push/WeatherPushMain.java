package observer.weather.push;


import observer.weather.push.observer.CurrentConditions;
import observer.weather.push.observer.ForecastDisplay;
import observer.weather.push.observer.StatisticsDisplay;
import observer.weather.push.subject.WeatherData;

public class WeatherPushMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("[WeatherPushMain]");
        weatherData.setMeasurements(18,65,30.f);
        System.out.println();
        weatherData.setMeasurements(22,70,29.2f);
        System.out.println();
        weatherData.setMeasurements(30,35,27.f);
        System.out.println();

        weatherData.removeObserver(forecastDisplay);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(5,15,27.f);
        System.out.println();
    }
}
