package interpreter;

/**
 * Created by jinjin on 2017/6/20.
 * Description：加法解释器
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        return exp1.interpreter() + exp2.interpreter();
    }
}
