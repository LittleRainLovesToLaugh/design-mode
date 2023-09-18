package command;

import command.light.Light;

/**
 * @author 谢迪
 * Date 2023年09月18日 11:37:00
 * Description 遥控器使用的简单测试
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
