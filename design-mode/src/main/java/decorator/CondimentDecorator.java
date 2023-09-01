package decorator;

/**
 * @author 谢迪
 * Date 2023年09月01日 14:52:00
 * Description
 * @Version: v1.0
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    void getDescription() {
        // 如何实现调料的getDescription()方法
        System.out.println("统一调料描述");
    }


}
