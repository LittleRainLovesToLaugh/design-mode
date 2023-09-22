package strategy;

import strategy.duck.Duck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyRocketPowered;

/**
 * @author 小雨
 * Date 2023年08月26日 16:36:00
 * Description 策略模式
 * @Version: v1.0
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
/*        // 构造方法写死的默认类型
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/
        // 加上模型鸭，并使 模型鸭具有火箭动力。
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
