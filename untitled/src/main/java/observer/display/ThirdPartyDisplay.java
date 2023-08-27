package observer.display;

import observer.observer.Observer;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        System.out.println("显示基于观测值的其他内容");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
