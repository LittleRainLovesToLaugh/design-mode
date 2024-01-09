package decorator.abstracts.component;

/**
 * @author 小雨
 * Date 2023年09月01日 13:58:00
 * Description 饮料  (装饰器模式：抽象组件)
 * @Version: v1.0
 */
public abstract class Beverage {

    /**
     * 不同包，要加public，否则可以使用默认的包限制修饰符
     */
    public String description = "未知的饮料 Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
