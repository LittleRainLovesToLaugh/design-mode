package strategy.pattern.duck;

import strategy.pattern.duck.Duck;

/**
 * @author 小雨
 * Date 2023年08月26日 14:30:00
 * Description
 * @Version: v1.0
 */
public class DecoyDuck extends Duck {



    @Override
    void display() {
        System.out.println("诱饵鸭");
    }
}
