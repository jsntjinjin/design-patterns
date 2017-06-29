package template;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Test {
    public static void main(String[] args) {
        BaseComputer computer = new CoderComputer();
        computer.startUp();

        BaseComputer computer1 = new MilitaryComputer();
        computer1.startUp();
    }
}
