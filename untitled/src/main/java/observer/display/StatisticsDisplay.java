package observer.display;

import observer.observer.Observer;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        System.out.println("显示最小、平均和最大的观测值");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
