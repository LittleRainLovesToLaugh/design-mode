package strategy.pattern.quack;

/**
 * @author 小雨
 * Date 2023年08月26日 16:07:00
 * Description
 * @Version: v1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // 实现鸭子呱呱叫
        System.out.println("实现鸭子呱呱叫");
    }
}
