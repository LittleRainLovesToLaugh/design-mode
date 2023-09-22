package strategy.quack;

/**
 * @author 小雨
 * Date 2023年08月26日 16:17:00
 * Description
 * @Version: v1.0
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        // 橡皮鸭子吱吱叫
        System.out.println("橡皮鸭子吱吱叫");
    }
}
