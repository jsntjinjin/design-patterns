package proxy.staticproxy;

/**
 * Created by jinjin on 2017/6/17.
 * Description：诉讼接口类
 */
public interface ILawsuit {

    // 提交申请
    void submit();

    // 进行举证
    void burden();

    // 开始辩护
    void defend();

    // 诉讼完毕
    void finish();

}
