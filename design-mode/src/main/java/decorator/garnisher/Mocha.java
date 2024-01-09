package decorator.garnisher;

import decorator.abstracts.component.Beverage;

/**
 * @author 小雨
 * Date 2023年09月01日 13:58:00
 * Description  (装饰器模式：具体装饰者)
 * 摩卡：是一个装饰者，所以让它扩展自CondimentDecorator。
 * &#064;Version:  v1.0
 */
public class Mocha extends CondimentDecorator {

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        // 想办法让被装饰者（饮料）被记录到实例变量中。
        // 这里的做法是：把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中。
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 我们希望叙述不只是描述饮料（例如“DarkRoast”），而是完整地连调料都描述出来（例如“DarkRoast, Mocha”）。
        // 所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述（例如“Mocha”）。
        return beverage.getDescription() + ", 摩卡 Mocha";
    }

    @Override
    public double cost() {
        // 要计算带Mocha饮料的价钱。首先把调用委托给被装饰对象，以计算价钱，然后再加上Mocha的价钱，得到最后结果。
        return .20 + beverage.cost();
    }
}
