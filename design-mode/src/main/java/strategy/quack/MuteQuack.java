package strategy.quack;

/**
 * @author 小雨
 * Date 2023年08月26日 16:17:00
 * Description
 * @Version: v1.0
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // 什么都不做，不会叫
        System.out.println("什么都不做，不会叫");
    }
}
