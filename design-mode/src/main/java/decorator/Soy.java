package decorator;

/**
 * @ClassnameSoy
 * @Description   (装饰器模式：调料具体装饰者)
 * @Version1.0.0
 * @Date2023/9/1 23:29
 * @author小雨 27662
 */
public class Soy extends CondimentDecorator{

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆浆";
    }

    @Override
    public double cost() {
        // 要计算带Mocha饮料的价钱。首先把调用委托给被装饰对象，以计算价钱，然后再加上Mocha的价钱，得到最后结果。
        return .2 + beverage.cost();
    }

}