package command.stereo;

import command.Command;

/**
 * @author 谢迪
 * Date 2023年09月22日 16:36:00
 * Description
 * @Version: v1.0
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
