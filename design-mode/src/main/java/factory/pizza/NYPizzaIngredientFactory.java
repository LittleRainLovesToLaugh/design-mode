package factory.pizza;

import factory.cheese.Cheese;
import factory.cheese.ReggianoCheese;
import factory.clams.Clams;
import factory.clams.FreshClams;
import factory.dough.Dough;
import factory.dough.ThinCrusDough;
import factory.pepperoni.Pepperoni;
import factory.pepperoni.SlicedPepperoni;
import factory.sauce.MarinaraSauce;
import factory.sauce.Sauce;
import factory.veggies.*;

/**
 * @author 谢迪
 * Date 2023年09月08日 15:18:00
 * Description 纽约披萨店原料工厂类
 * @Version: v1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrusDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    /**
     * 对于蔬菜，以一个蔬菜数组为返回值。在这里我们是直接把蔬菜写死。其实我们可以把它改写得更好一点，但这对于学习工厂模式并没有帮助，所以辽是保持这个简单的做法就好了。
     */
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
