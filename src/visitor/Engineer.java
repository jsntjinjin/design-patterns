package visitor;

import java.util.Random;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(10000);
    }
}
