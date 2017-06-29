package singleton;

/**
 * Created by jinjin on 2017/6/29.
 * Description：懒汉式（Double CheckLock）
 */
public class Singleton2 {
    private volatile static Singleton2 mInstance = null;
    private Singleton2() {}
    public static Singleton2 getInstance(){
        if(mInstance == null){
            synchronized(Singleton2.class){
                if(mInstance == null){
                    mInstance = new Singleton2();
                }
            }
        }
        return mInstance;
    }
}
