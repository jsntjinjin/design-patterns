package singleton;

/**
 * Created by jinjin on 2017/6/29.
 * Description：恶汉式
 */
public class Singleton1 {

    private static Singleton1 mInstance = new Singleton1();
    private Singleton1() {}
    public static Singleton1 getInstance(){
        return mInstance;
    }
}
