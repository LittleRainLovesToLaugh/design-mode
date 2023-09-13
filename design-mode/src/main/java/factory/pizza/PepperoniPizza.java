package factory.pizza;

import factory.pizza.factory.PizzaIngredientFactory;

/**
 * @author 谢迪
 * Date 2023年09月12日 15:56:00
 * Description 蔬菜披萨
 * @Version: v1.0
 */
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing:准备 " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
