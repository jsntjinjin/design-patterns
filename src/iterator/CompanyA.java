package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinjin on 2017/6/27.
 * Description：
 */
public class CompanyA implements Company {

    private List<Employee> list = new ArrayList<>();

    public CompanyA() {
        list.add(new Employee("张三", 20, "男", "财务1"));
        list.add(new Employee("李四", 32, "男", "财务2"));
        list.add(new Employee("王五", 23, "男", "财务3"));
        list.add(new Employee("赵六", 45, "男", "财务4"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImplA(list);
    }
}
