package strategy.pattern.duck;

import strategy.pattern.duck.Duck;
import strategy.pattern.fly.FlyWithWings;
import strategy.pattern.quack.Quack;

/**
 * @author 小雨
 * Date 2023年08月26日 14:17:00
 * Description
 * @Version: v1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
