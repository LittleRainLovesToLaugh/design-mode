package command.light;

import command.Command;

/**
 * @author 谢迪
 * Date 2023年09月18日 11:21:00
 * Description 这是一个命令，所以需要实现Command接口。(灯亮命令)
 * @Version: v1.0
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        // 构造器被传入了某个电灯（比方说：客厅的电灯)，以便让这个命今控制，然后记录在实例变量中。一旦镯用execute(),就由这个电灯对象成为接妆老，负责接受请求。
        this.light = light;
    }

    @Override
    public void execute() {
        // 这个execute()方法涠用接收对象（我们正在控制的电灯）的on()方法。
        light.on();
    }
}
