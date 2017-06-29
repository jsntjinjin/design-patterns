package strategy;

/**
 * Created by jinjin on 2017/6/29.
 * Description：使用策略
 */
public class TranficCalculator {

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
