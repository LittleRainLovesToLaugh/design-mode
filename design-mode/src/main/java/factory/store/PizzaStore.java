package factory.store;

import factory.pizza.Pizza;

/**
 * @author 谢迪
 * Date 2023年09月12日 15:28:00
 * Description 提供一个抽象接口来创建“一个产品
 * @Version: v1.0
 */
public abstract class PizzaStore {

    /**
     * 创建披萨
     */
    protected abstract Pizza createPizza(String item);

    /**
     * 披萨价格计算
     */
    protected Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
