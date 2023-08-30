package observable;

import observer.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 *
 * @author 27662
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {


    Observable observable;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    /**
     * 构造器需要 weatherData对象（也 就是主题）作为注册之用。
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 当update()被调用时，我们把温度和湿度保存起来，然后调用display()。
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前条件，温度：" + temperature
                + "F 湿度" + humidity + "% ");
    }

}
