package command.simple;

import command.Command;

/**
 * @author 谢迪
 * Date 2023年09月18日 11:26:00
 * Description 简易遥控：假设我们有一个遥控器，它只有一个按钮和对应的插槽，可以控制一个装置
 * @Version: v1.0
 */
public class SimpleRemoteControl {

    /**
     * 有一个插槽持有命令，而这个命令控制着一个装置。
     */
    Command command;

    public SimpleRemoteControl() {
    }

    /**
     * 设置插槽控制的命令。如果这段代码的客户想要改变遥控器的行为，可以调用这个方法。
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 当按下这个按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute()方法。
     */
    public void buttonWasPressed() {
        command.execute();
    }

}
