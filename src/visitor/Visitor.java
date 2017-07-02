package visitor;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public interface Visitor {
    void visit(Manager manager);

    void visit(Engineer engineer);
}
