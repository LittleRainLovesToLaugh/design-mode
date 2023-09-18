package command;

/**
 * @author 谢迪
 * Date 2023年09月18日 11:05:00
 * Description 命令接口
 * @Version: v1.0
 */
public interface Command {

    /**
     * 所有的命令对象实现相同地包含一个方法的接口
     */
    void execute();

}
