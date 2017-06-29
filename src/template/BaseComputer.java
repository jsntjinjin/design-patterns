package template;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public abstract class BaseComputer {

    public void powerOn() {
        System.out.println("开启电源");
    }

    public void checkHardware() {
        System.out.println("检查硬件");
    }

    public void loadOs() {
        System.out.println("装载操作系统");
    }

    public void login() {
        System.out.println("普通电脑不需要验证，直接进入系统");
    }

    public final void startUp() {
        System.out.println("开机 start");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("开机 end");
    }
}
