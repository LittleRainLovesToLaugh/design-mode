package strategy.pattern.fly;

/**
 * @author 小雨
 * Date 2023年08月26日 16:07:00
 * Description
 * @Version: v1.0
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        // 什么都不做，不会飞
        System.out.println("什么都不做，不会飞");
    }
}
