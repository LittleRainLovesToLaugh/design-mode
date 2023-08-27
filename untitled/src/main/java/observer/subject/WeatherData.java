package observer.subject;

import observer.observer.Observer;

public  class WeatherData implements Subject {
    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }

    public void getTemperature() {

    }

    public void getHumidity() {

    }

    public void getPressure() {

    }

    public void measurementsChanged() {

    }

}
