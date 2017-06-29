package proxy.dynamicproxy;

import proxy.staticproxy.ILawsuit;
import proxy.staticproxy.XiaoMin;

import java.lang.reflect.Proxy;

/**
 * Created by jinjin on 2017/6/17.
 * Description：
 */
public class DynamicClient {

    public static void main(String[] args) {
        // 构造小明
        ILawsuit xiaoMin = new XiaoMin();

        // 构造动态代理
        DynamicProxy proxy = new DynamicProxy(xiaoMin);

        // 构造小明的ClassLoader
        ClassLoader loader = xiaoMin.getClass().getClassLoader();

        // 构造代理律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        // 开始流程
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

}
