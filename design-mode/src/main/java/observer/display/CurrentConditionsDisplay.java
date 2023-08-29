package observer.display;

import observer.observer.Observer;
import observer.subject.Subject;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

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

    /**
     * 构造器需要 weatherData对象（也 就是主题）作为注册之用。
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前状况" + temperature
                + "温度 " + humidity + "% 湿度" + pressure + "压力");
    }

    //    当update()被调用时，我们
//    把温度和湿度保存起来，
//    然后调用display()。
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
        System.out.println("显示当前观测值");
    }
}
