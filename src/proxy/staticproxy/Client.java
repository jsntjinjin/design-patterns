package proxy.staticproxy;

/**
 * Created by jinjin on 2017/6/17.
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        // 构造小明
        ILawsuit xiaoMin = new XiaoMin();

        // 构造代理律师
        ILawsuit lawyer = new Lawyer(xiaoMin);

        // 开始流程
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
