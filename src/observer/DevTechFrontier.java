package observer;

import java.util.Observable;

/**
 * Created by jinjin on 2017/6/22.
 * Description：
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        // 标识状态或者内容发生改变
        setChanged();
        // 通知所有的观察者
        notifyObservers(content);
    }
}
