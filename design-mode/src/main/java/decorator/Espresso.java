package decorator;

/**
 * @author 小雨
 * Date 2023年09月01日 14:49:00
 * Description 浓咖啡  (装饰器模式：具体组件)
 * @Version: v1.0
 */
public class Espresso extends Beverage {

    /**
     * 为了要设置饮料的描述，我们写了一个构造器。description实例变量继承自Beverage。
     */
    public Espresso() {
        description = "浓咖啡 Espresso";
    }

    /**
     * 需要计算Espresso的价钱，现在不需要管调料的价钱，直接把Espresso的价格$1.99返回即可。
     * @return $1.99
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
