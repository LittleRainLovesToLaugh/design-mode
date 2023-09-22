package command;

/**
 * @author 谢迪
 * Date 2023年09月22日 15:56:00
 * Description  无命令
 * @Version: v1.0
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("无命令!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
