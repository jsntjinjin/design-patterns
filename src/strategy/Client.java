package strategy;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        // 动态设置策略
        calculator.setStrategy(new BusStrategy());
        calculator.calculatePrice(20);

        calculator.setStrategy(new TexiStrategy());
        calculator.calculatePrice(20);
    }
}
