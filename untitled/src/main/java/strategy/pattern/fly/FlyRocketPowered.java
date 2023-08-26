package strategy.pattern.fly;

/**
 * @author 谢迪
 * Date 2023年08月26日 16:52:00
 * Description
 * @Version: v1.0
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我在用火箭飞行");
    }
}