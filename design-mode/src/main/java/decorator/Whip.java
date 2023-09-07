package decorator;

/**
 * @Classname Whip
 * @Description (装饰器模式：调料具体装饰者)
 * @Version1.0.0
 * @Date 2023/9/1 23:31
 * @author小雨 27662
 */
public class Whip extends CondimentDecorator{


    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶泡";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
