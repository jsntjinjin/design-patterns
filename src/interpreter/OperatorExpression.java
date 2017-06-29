package interpreter;

/**
 * Created by jinjin on 2017/6/20.
 * Description：运算符解释器 所有运算符共性抽取
 */
public abstract class OperatorExpression extends ArithmeticExpression {

    protected ArithmeticExpression exp1, exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
