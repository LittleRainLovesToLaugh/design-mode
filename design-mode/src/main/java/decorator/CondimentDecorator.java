package decorator;

/**
 * @author 小雨
 * Date 2023年09月01日 14:52:00
 * Description (装饰器模式：抽象装饰者)
 * @Version: v1.0
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     * 所有的调料装饰者都必须重新实现 getDescription()方法
     */
    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
