package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public class BusinessReport {
    List<Staff> staffs = new LinkedList<>();

    public BusinessReport() {
        staffs.add(new Manager("王经理"));
        staffs.add(new Engineer("工程师A"));
        staffs.add(new Engineer("工程师B"));
        staffs.add(new Engineer("工程师C"));
        staffs.add(new Engineer("工程师D"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
