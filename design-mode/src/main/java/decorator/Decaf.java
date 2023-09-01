package decorator;
/**
 * @author 小雨
 * Date 2023年09月01日 14:49:00
 * Description  无咖啡因咖啡  (具体组件)
 * @Version: v1.0
 */
public class Decaf extends Beverage{

    public Decaf() {
        description = " 无咖啡因咖啡  Decaf";
    }

    @Override
    public double cost() {
        return 2.55;
    }
}
