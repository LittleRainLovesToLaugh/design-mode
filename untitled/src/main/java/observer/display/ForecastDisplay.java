package observer.display;

import observer.observer.Observer;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class ForecastDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        System.out.println("显示天气预报");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        
    }
}
