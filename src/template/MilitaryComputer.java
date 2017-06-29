package template;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class MilitaryComputer extends BaseComputer {

    @Override
    public void checkHardware() {
        super.checkHardware();
        System.out.println("检查防火墙");
    }

    @Override
    public void login() {
        System.out.println("军用计算机需要进行指纹识别等验证操作");
    }
}
