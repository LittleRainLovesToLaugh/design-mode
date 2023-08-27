package observer.display;

import observer.observer.Observer;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("显示当前观测值");
    }
}
