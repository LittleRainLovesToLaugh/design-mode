package observer.observer;

/**
 * 观察者
 */
public interface Observer {


    /**
     * 所有潜在的观察者必须实现观察者接口当主题状态改变时它被调用。
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者。
     */
    void update(float temp, float humidity, float pressure);
}
