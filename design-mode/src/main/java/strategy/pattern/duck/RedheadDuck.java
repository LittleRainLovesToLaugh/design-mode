package strategy.pattern.duck;

import strategy.pattern.duck.Duck;

/**
 * @author 小雨
 * Date 2023年08月26日 14:25:00
 * Description
 * @Version: v1.0
 */
public class RedheadDuck extends Duck {
    @Override
    void display() {
        System.out.println("外观是红头");
    }
}
