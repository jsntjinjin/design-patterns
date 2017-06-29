package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jinjin on 2017/6/22.
 * Description：
 */
public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, " + name + ", DevTechFrontier更新了，内容： " + arg);
    }
}
