package observer.weather.push.observer;


import observer.weather.push.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humid;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humid, float pressure) {
        this.temp = temp;
        this.humid = humid;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("[ForecastDisplay] : " + temp + " Celcious " + humid + "% " + pressure + " pressure");
    }
}
