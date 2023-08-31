package observer.subject;

import observer.observer.Observer;

/**
 * 主题与观察者都使用接口：观察者利用主题的接口
 * 向主题注册，而主题利用观察者接口通知观察者。
 * 这样可以让两者之间运作正常，又同时具有松耦合的优点。
 */
public interface Subject extends Observer {

    /**
     * 注册为观察者
     * 需要一个观察者作为变量，该观察者是用来注册的。
     */
    void registerObserver(Observer o);

    /**
     * 从观察者中删除
     * 需要一个观察者作为变量，该观察者是用来删除的。
     */
    void removeObserver(Observer o);

    /**
     *当主题状态改变时， 这个方法会被调用，以通知所有的观察者。
     */
    void notifyObservers();

}
