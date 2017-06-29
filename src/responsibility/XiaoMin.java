package responsibility;

/**
 * Created by jinjin on 2017/6/19.
 * Description：
 */
public class XiaoMin {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        groupLeader.handleRequest(50000);
    }
}
