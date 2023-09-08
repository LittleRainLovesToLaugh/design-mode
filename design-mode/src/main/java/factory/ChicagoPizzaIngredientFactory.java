package factory;

import factory.cheese.Cheese;
import factory.clams.Clams;
import factory.dough.Dough;
import factory.pepperoni.Pepperoni;
import factory.sauce.Sauce;
import factory.veggies.*;

/**
 * @author 谢迪
 * Date 2023年09月08日 15:53:00
 * Description 芝加哥披萨店原料工厂类
 * @Version: v1.0
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{


    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }
}
