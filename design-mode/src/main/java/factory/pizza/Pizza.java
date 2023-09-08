package factory.pizza;

import factory.cheese.Cheese;
import factory.clams.Clams;
import factory.dough.Dough;
import factory.pepperoni.Pepperoni;
import factory.sauce.Sauce;
import factory.veggies.Veggies;

import java.util.Arrays;

/**
 * @author 谢迪
 * Date 2023年09月08日 16:15:00
 * Description
 * @Version: v1.0
 */
public abstract class Pizza {


    String name;
    /**
     * 面团
     */
    Dough dough;
    /**
     * 酱汁
     */
    Sauce sauce;
    /**
     * 蔬菜
     */
    Veggies[] veggies;
    /**
     * 奶酪
     */
    Cheese cheese;
    /**
     * 意式腊肠
     */
    Pepperoni pepperoni;

    /**
     * 蛤蛎
     */
    Clams clams;

    abstract void prepare();


    void back(){
        System.out.println("在350度的温度下烤25分钟 Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("把披萨切成对角的小片 Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("将披萨放入官方的PizzaStore盒子中 Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public Pizza setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
