package command.stereo;

/**
 * @author 谢迪
 * Date 2023年09月22日 16:29:00
 * Description 音箱
 * @Version: v1.0
 */
public class Stereo {

    int volume;

    /**
     * 打开音箱
     */
    public void on() {
        System.out.println("打开音箱");
    }

    /**
     * 关闭音箱
     */
    public void off() {
        System.out.println("关闭音箱");
    }

    /**
     * 设置音箱为播放CD模式
     */
    public void setCd() {
        System.out.println("CD模式");
    }

    /**
     * 设置为收音机模式
     */
    public void setRadio() {
        System.out.println("收音机模式");
    }

    /**
     * 设置音量
     */
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("设置音量成功，当前音量：" + this.volume);
    }


}
