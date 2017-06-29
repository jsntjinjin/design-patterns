package responsibility;

/**
 * Created by jinjin on 2017/6/19.
 * Description：
 */
public class Manager extends Leader {
    @Override
    public void handle(int money) {
        System.out.print("经理批复报账" + money + "元");
    }

    @Override
    public int limit() {
        return 10000;
    }
}
