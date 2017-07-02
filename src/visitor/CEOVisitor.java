package visitor;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("经理:" + manager.name + " kpi:" + manager.kpi + " projects:" + manager.getProjects());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师:" + engineer.name + " kpi:" + engineer.kpi);
    }
}
