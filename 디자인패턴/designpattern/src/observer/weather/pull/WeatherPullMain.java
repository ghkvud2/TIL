package observer.weather.pull;


import observer.weather.pull.observer.CurrentConditions;
import observer.weather.pull.observer.ForecastDisplay;
import observer.weather.pull.observer.StatisticsDisplay;
import observer.weather.pull.subject.WeatherData;

public class WeatherPullMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
