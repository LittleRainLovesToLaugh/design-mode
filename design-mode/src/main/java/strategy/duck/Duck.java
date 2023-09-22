package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

/**
 * @author 小雨
 * Date 2023年08月26日 14:07:00
 * Description 鸭子超类（策略模式超类）
 * @Version: v1.0
 */
public abstract class Duck {

    /**
     * 依赖抽象，而不依赖具体
     */
    FlyBehavior flyBehavior;

    /**
     * 依赖抽象，而不依赖具体
     */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 所有鸭子都会游泳
     */
    void swim() {
        System.out.println("所有鸭子都会游泳");
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 负责实现自己的行为 在屏幕上显示其外观。
     */
    abstract void display();


    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
