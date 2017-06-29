package singleton;

/**
 * Created by jinjin on 2017/6/29.
 * Description：静态内部类单例模式
 */
public class Singleton3 {

    private Singleton3(){}
    public static Singleton3 getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder{
        private static final Singleton3 sInstance = new Singleton3();
    }
}
