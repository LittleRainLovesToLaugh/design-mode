package factory.pizza.factory;

import factory.cheese.Cheese;
import factory.clams.Clams;
import factory.dough.Dough;
import factory.pepperoni.Pepperoni;
import factory.sauce.Sauce;
import factory.veggies.Veggies;

/**
 * @author 谢迪
 * Date 2023年09月08日 15:01:00
 * 抽象工厂模式
 * 抽象工厂的方法经常以工厂方法的方式实现，这很有道理，对吧？
 * 抽象工厂的任务是定义一个负责创建一组产品的接口。这个接口内的每个方法都负责创建一个具体产品，同时我们利用实现抽象工厂的子类来提供这些具体的做法。
 * 所以，在抽象工厂中利用工厂方法实现生产方法是相当自然的做法。
 * Description 抽象的披萨原料工厂接口
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
