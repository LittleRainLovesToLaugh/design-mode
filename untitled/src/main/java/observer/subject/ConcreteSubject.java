package observer.subject;

import observer.observer.Observer;

/**
 * 一个具体主题总是实现主题接口，除了注册和撤销方法之外，具体主题还实现了notifyObservers()方法，
 * 此方法用于在状态改变时更新所有当前观察者。
 */
@Deprecated
public abstract class ConcreteSubject implements Subject {

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    /**
     * ，此方法用于在状态改变时更新所有当前观察者。
     */
    @Override
    public void notifyObservers() {

    }

//    具体主题也可能有设置和获取 状态的方法
    public void getState() {

    }

    public void setState() {

    }
}
