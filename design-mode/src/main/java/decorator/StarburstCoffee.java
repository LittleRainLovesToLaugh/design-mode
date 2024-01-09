package decorator;

import decorator.abstracts.component.Beverage;
import decorator.abstracts.component.DarkRoast;
import decorator.abstracts.component.HouseBlend;
import decorator.garnisher.Mocha;
import decorator.garnisher.Soy;
import decorator.garnisher.Whip;

/**
 * @author 谢迪
 * Date 2023年09月06日 17:13:00
 * Description 装饰器模式演示
 * @Version: v1.0
 */
public class StarburstCoffee {

    public static void main(String[] args) {
        // 订一杯Espresso，不需要调料，打印 出它的描述与价钱。
 /*       Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());*/
        System.out.println("————————————————————————————————————————————————————————————————————————————");
        // 制造出一个DarkRoast对象。 用Mocha装饰它。用第二个Mocha装饰它。用Whip装饰它
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        System.out.println("————————————————————————————————————————————————————————————————————————————");
        // 最后，再来一杯调料为豆浆、摩 卡、奶泡的HouseBlend咖啡。
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
        System.out.println("————————————————————————————————————————————————————————————————————————————");

    }

}
