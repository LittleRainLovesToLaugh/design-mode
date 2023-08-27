package strategy.pattern.duck;

import strategy.pattern.duck.Duck;

/**
 * @author 谢迪
 * Date 2023年08月26日 14:28:00
 * Description
 * @Version: v1.0
 */
public class RubberDuck extends Duck {


    @Override
    void display() {
        System.out.println("外观是橡皮鸭");
    }

}