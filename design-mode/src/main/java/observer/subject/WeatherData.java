package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;

/**
 * 观察者模式利用“组合”将许多观察者组合进主题中。对象之间的这种关系不是通过继承产生的，而是在运行时利用组合的方式而产生的。
 *
 * @author 27662
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
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

    public WeatherData() {
        //        我们加上一个ArrayList来纪录观察者，此ArrayList是在构造器中建立的。
        observers = new ArrayList<>();
    }

    /**
     * 当注册观察者时，我们只要把它加到ArrayList的后面即可。
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 当观察者想取消注册，我们把它从ArrayList中删除即可。
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 我们把状态告诉每一个观察者。因为 观察者都实现了update()，所以我们知道如何通知它们
     */
    @Override
    public void notifyObservers() {
        for (Observer value : observers) {
            value.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者。
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置温度、湿度、压力
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    压力
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    }
}
