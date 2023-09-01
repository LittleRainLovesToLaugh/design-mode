package decorator;
/**
 * @author 小雨
 * Date 2023年09月01日 14:49:00
 * Description  深度烘焙咖啡  (装饰器模式：具体组件)
 * @Version: v1.0
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = " 深度烘焙咖啡  DarkRoast";
    }

    @Override
    public double cost() {
        return 9.55;
    }
}
