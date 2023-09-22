package command;

/**
 * @author 谢迪
 * Date 2023年09月22日 15:52:00
 * Description 实现遥控器
 * @Version: v1.0
 */
public class RemoteControl {

    /**
     * 遥控器要处理很多开与关的命令，使用数组记录命令
     */
    Command[] onCommands;

    /**
     * 遥控器要处理很多开与关的命令，使用数组记录命令
     */
    Command[] offCommands;

    /**
     * 在构造方法中，需要实例化并初始化这两个开与关的数组
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command onCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = onCommand;
            offCommands[i] = onCommand;
        }
    }

    /**
     * @param slot       插槽的位置
     * @param onCommand  开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 当按下开或关的按钮，硬件就会负责调用对应的方法
     *
     * @param slot 插槽的位置
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 当按下开或关的按钮，硬件就会负责调用对应的方法
     *
     * @param slot 插槽的位置
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String tostring() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ").append(i).append("]").append(onCommands[i].getClass().getName()).append("   ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return builder.toString();
    }

}
