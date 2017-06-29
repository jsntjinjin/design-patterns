package responsibility;

/**
 * Created by jinjin on 2017/6/19.
 * Description：
 */
public class Boss extends Leader {
    @Override
    public void handle(int money) {
        System.out.print("老板批复报账" + money + "元");
    }

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }
}
