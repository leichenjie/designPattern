package main.java.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay2 implements Observer,DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2)o;
            lastPressure = currentPressure;
            currentPressure = weatherData2.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + currentPressure + "F degrees and " + lastPressure + "%humidity");
    }
}
