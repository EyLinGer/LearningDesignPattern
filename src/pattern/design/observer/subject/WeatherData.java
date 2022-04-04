package pattern.design.observer.subject;

import pattern.design.observer.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;
    public WeatherData()
    {
        observers = new ArrayList<>();
    }
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    private void measurementChanged()
    {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o))
        {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0)
        {
            observers.remove((index));
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
