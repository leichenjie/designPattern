package main.java.observer;

public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();
        CurrentConditionsDisplay2 currentConditionsDisplay = new CurrentConditionsDisplay2(weatherData);
        ForecastDisplay2 forecastDisplay = new ForecastDisplay2(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.4f);
        weatherData.setMeasurements(78,90,35.8f);
    }
}
