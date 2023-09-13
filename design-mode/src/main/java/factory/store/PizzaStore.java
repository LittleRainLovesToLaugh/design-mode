package factory.store;

import factory.pizza.Pizza;

/**
 * @author 谢迪
 * Date 2023年09月12日 15:28:00
 * Description 工厂模式
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
        System.out.println("烘烤");
        System.out.println("切片");
        System.out.println("装盒");
        return pizza;
    }

}
