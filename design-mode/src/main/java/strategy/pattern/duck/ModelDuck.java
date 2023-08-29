package strategy.pattern.duck;

import strategy.pattern.fly.FlyNoWay;
import strategy.pattern.quack.Quack;

/**
 * @author 谢迪
 * Date 2023年08月26日 16:53:00
 * Description
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
