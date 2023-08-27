package observer.observer;

import observer.subject.ConcreteSubject;

/**
 *具体的观察者可以是实现此接口的任意类。
 * 观察者必须注册具体主题，以便接收更新。
 */
public class ConcreteObserver extends ConcreteSubject implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    // 其他观察者的具体方法
}
