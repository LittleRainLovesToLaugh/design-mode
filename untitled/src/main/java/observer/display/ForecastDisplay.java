package observer.display;

import observer.observer.Observer;
import observer.subject.Subject;
import observer.subject.WeatherData;

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

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("显示天气预报" + temperature
            + "温度 " + humidity + "% 湿度" + pressure + "压力");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
        System.out.println("显示天气预报");
    }
}
