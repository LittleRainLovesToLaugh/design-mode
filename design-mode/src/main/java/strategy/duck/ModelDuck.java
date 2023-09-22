package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

/**
 * @author 小雨
 * Date 2023年08月26日 16:53:00
 * Description 策略模式
 * @Version: v1.0
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        // 一开始， 我们的模型鸭是 不会飞的。
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I’m a model duck        我是一只鸭子模型");
    }
}
