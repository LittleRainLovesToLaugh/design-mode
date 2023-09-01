package observable;

import observer.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 小雨
 * Date 2023年08月30日 18:07:00
 * Description
 * @Version: v1.0
 */
public class ForecastDisplay implements Observer, DisplayElement {

    Observable observable;

    private float currentPressure = 29.92f ;

    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("预测显示,目前的压力：" + currentPressure
                + "最后的压力： " + lastPressure);
    }
}
