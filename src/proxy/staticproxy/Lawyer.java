package proxy.staticproxy;

/**
 * Created by jinjin on 2017/6/17.
 * Description：代理律师
 */
public class Lawyer implements ILawsuit {

    private ILawsuit lawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    @Override
    public void submit() {
        System.out.println("小明找到律师");
        lawsuit.submit();
    }

    @Override
    public void burden() {
        System.out.println("律师了解情况");
        lawsuit.burden();
    }

    @Override
    public void defend() {
        System.out.println("律师帮助小明提起诉讼，并到法院提交证据");
        lawsuit.defend();
    }

    @Override
    public void finish() {
        lawsuit.finish();
        System.out.println("小明和律师结算代理费用");
    }
}
