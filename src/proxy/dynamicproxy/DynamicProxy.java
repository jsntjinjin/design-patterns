package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jinjin on 2017/6/17.
 * Description：
 */
public class DynamicProxy implements InvocationHandler {

    // 被代理的类的引用
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理人的方法
        if (method.getName().equals("submit")) {
            System.out.println("小明找到律师");
        } else if (method.getName().equals("burden")) {
            System.out.println("律师了解情况");
        } else if (method.getName().equals("defend")) {
            System.out.println("律师帮助小明提起诉讼，并到法院提交证据");
        }
        Object result = method.invoke(object, args);
        if (method.getName().equals("finish")) {
            System.out.println("小明和律师结算代理费用");
        }
        return result;
    }
}
