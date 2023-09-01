package strategy.pattern.fly;

/**
 * @author 小雨
 * Date 2023年08月26日 16:07:00
 * Description
 * @Version: v1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        // 实现鸭子飞行
        System.out.println("实现鸭子飞行");
    }
}
