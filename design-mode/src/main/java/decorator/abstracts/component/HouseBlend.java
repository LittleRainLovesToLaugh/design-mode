package decorator.abstracts.component;

/**
 * @author 小雨
 * Date 2023年09月01日 14:49:00
 * Description 自制混合咖啡  (装饰器模式：具体组件)
 * @Version: v1.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "自制混合咖啡  House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
