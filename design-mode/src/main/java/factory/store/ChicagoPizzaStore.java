package factory.store;

import factory.pizza.*;
import factory.pizza.factory.ChicagoPizzaIngredientFactory;
import factory.pizza.factory.PizzaIngredientFactory;

/**
 * @author 谢迪
 * Date 2023年09月12日 15:30:00
 * Description   PixxaStore?的实现为工厂方法，因为我们需要根据区域变化创建产品。通过工厂方法，每个区域都有自己的具体工厂，他们都知道如何制作适合该区域的比萨。
 * @Version: v1.0
 */
public class ChicagoPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            // 把工厂传递给每一个比萨，以便比萨能从把工厂传递给每一个比萨，以便比萨能从工厂中取得原料。
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese pizza 芝加哥式芝士披萨");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza 芝加哥风格的素食披萨");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza 芝加哥蛤蜊披萨");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza 芝加哥式意大利辣香肠披萨");
        }
        return pizza;
    }

}
