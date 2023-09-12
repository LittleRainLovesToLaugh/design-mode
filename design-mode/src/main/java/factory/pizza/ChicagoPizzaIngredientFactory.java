package factory.pizza;

import factory.cheese.Cheese;
import factory.cheese.Mozzarella;
import factory.clams.Clams;
import factory.clams.FrozenClams;
import factory.dough.Dough;
import factory.dough.ThinCrusDough;
import factory.pepperoni.Pepperoni;
import factory.pepperoni.SlicedPepperoni;
import factory.sauce.PlumTomatoSauce;
import factory.sauce.Sauce;
import factory.veggies.BlackOlives;
import factory.veggies.EggPlant;
import factory.veggies.Spinach;
import factory.veggies.Veggies;

/**
 * @author 谢迪
 * Date 2023年09月08日 15:53:00
 * Description 芝加哥披萨店原料工厂类
 * @Version: v1.0
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThinCrusDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
