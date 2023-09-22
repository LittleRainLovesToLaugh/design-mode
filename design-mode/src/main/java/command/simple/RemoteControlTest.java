package command.simple;

import command.light.Light;
import command.light.LightOnCommand;

/**
 * @author 谢迪
 * Date 2023年09月18日 11:37:00
 * Description 遥控器使用的简单测试
 *  simple包下面都是简单遥控器的测试
 * @Version: v1.0
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }

}
