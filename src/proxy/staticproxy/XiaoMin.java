package proxy.staticproxy;

/**
 * Created by jinjin on 2017/6/17.
 * Description：具体的诉讼人
 */
public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板欠我工资，我要起诉！");
    }

    @Override
    public void burden() {
        System.out.println("这是合同和银行工资流水！");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿！");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！老板必须结算工资！");
    }
}
