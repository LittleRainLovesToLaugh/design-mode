package factory.store;

import factory.pizza.*;

/**
 * @author 谢迪
 * Date 2023年09月12日 15:30:00
 * Description 使用工厂模式进行对象的创建
 * @Version: v1.0
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            // 把工厂传递给每一个比萨，以便比萨能从把工厂传递给每一个比萨，以便比萨能从工厂中取得原料。
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese pizza 纽约式芝士披萨");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza 纽约风格的素食披萨");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza 纽约蛤蜊披萨");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza 纽约式意大利辣香肠披萨");
        }
        return pizza;
    }

}
