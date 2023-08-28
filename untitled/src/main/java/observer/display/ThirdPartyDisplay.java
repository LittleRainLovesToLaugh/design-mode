package observer.display;

import observer.observer.Observer;
import observer.subject.Subject;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    /**
     * 构造器需要 weatherData对象（也 就是主题）作为注册之用。
     */
    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("显示基于观测值的其他内容");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        display();
        System.out.println("显示基于观测值的其他内容");
    }
}
