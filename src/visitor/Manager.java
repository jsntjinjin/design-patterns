package visitor;

import java.util.Random;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public class Manager extends Staff {

    private int projects;

    public Manager(String name) {
        super(name);
        projects = new Random().nextInt(5);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProjects() {
        return projects;
    }
}
