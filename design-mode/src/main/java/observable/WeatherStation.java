package observable;


/**
 * 使用Java内置的 Observable实现观察者模式
 * 但是 Observable是一个类，有他的局限性，更糟的是，它甚至没有实现一个接口
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        new ForecastDisplay(weatherData);
        new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
