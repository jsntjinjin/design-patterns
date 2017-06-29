package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinjin on 2017/6/27.
 * Description：
 */
public class CompanyB implements Company {

    private Employee[] array = new Employee[3];

    public CompanyB() {
        array[0] = new Employee("张三", 20, "男", "财务1");
        array[1] = new Employee("李四", 32, "男", "财务2");
        array[2] = new Employee("王五", 23, "男", "财务3");
    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImplB(array);
    }
}
