package interpreter;

/**
 * Created by jinjin on 2017/6/20.
 * Description：数字解释器  用来解释数据
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }
}
