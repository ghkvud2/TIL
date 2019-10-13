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

        System.out.println("[WeatherPullMain]");
        weatherData.setMeasurements(18, 65, 30.f);
        System.out.println();
        weatherData.setMeasurements(22, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(30, 35, 27.f);
        System.out.println();

        weatherData.deleteObserver(forecastDisplay);
        weatherData.deleteObserver(statisticsDisplay);
        weatherData.setMeasurements(5, 15, 27.f);
        System.out.println();
    }
}
