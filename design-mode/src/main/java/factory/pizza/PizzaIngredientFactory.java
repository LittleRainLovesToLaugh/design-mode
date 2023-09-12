package factory.pizza;

import factory.cheese.Cheese;
import factory.clams.Clams;
import factory.dough.Dough;
import factory.pepperoni.Pepperoni;
import factory.sauce.Sauce;
import factory.veggies.Veggies;

/**
 * @author 谢迪
 * Date 2023年09月08日 15:01:00
 * Description 创建所有原料的接口
 * @Version: v1.0
 */
public interface PizzaIngredientFactory {


    /**
     * 创建面团
     * @return 面团
     */
    Dough createDough();

    /**
     * 创建酱汁
     * @return 酱汁
     */
    Sauce createSauce();

    /**
     * 创建奶酪
     * @return 奶酪
     */
    Cheese createCheese();

    /**
     * 创建蔬菜
     * @return 蔬菜
     */
    Veggies[] createVeggies();

    /**
     * 创建意式腊肠
     * @return 意式腊肠
     */
    Pepperoni createPepperoni();

    /**
     * 创建蛤蛎
     *
     * @return 蛤蛎
     */
    Clams createClam();


}
