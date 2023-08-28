package observer.display;

import observer.observer.Observer;
import observer.subject.Subject;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class ForecastDisplay implements Observer, DisplayElement {


    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压力
     */
    private float pressure;

    private Subject weatherData;


    @Override
    public void display() {
        System.out.println("显示天气预报");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        
    }
}
