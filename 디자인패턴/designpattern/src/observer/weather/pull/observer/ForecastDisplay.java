package observer.weather.pull.observer;


import observer.weather.pull.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humid;
    private float pressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[ForecastDisplay] : " + temp + " Celcious " + humid + "% " + pressure + " pressure");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humid = weatherData.getHumid();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
