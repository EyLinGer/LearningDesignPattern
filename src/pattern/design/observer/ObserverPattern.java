package pattern.design.observer;

import pattern.design.observer.observer.CurrentConditionDisplay;
import pattern.design.observer.subject.WeatherData;

public class ObserverPattern {
    public void run()
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherData.registerObserver(currentConditionDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
