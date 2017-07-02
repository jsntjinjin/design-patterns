package visitor;

import java.util.Random;

/**
 * Created by jinjin on 2017/6/30.
 * Description：员工基类
 */
public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
