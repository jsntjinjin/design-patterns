package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinjin on 2017/6/29.
 * Description：使用容器实现单例
 */
public class SingleManager {
    private static Map<String, Object> objMap = new HashMap<String, Object>();
    private SingleManager(){}

    public static void registerService(String key, Object instance){
        if(objMap.containsKey(key)){
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
