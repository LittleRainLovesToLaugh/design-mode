package command.garage;

import command.Command;

/**
 * @author 谢迪
 * Date 2023年09月22日 16:25:00
 * Description
 * @Version: v1.0
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
        garageDoor.stop();
        garageDoor.lightOn();
        garageDoor.off();
        garageDoor.lightOff();
    }
}
