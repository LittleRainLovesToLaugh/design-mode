package decorator;

/**
 * @author 谢迪
 * Date 2023年09月01日 14:49:00
 * Description
 * @Version: v1.0
 */
public abstract class Espresso extends Beverage {


    @Override
    public void cost() {
        // 想想如何实现咖啡和调料的cost()方法
        System.out.println("单杯咖啡价格 5元");
    }
}
