package iterator;

import java.util.List;

/**
 * Created by jinjin on 2017/6/27.
 * Description：
 */
public class IteratorImplA implements Iterator {

    private List<Employee> list;
    private int position;

    public IteratorImplA(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;
        return employee;
    }
}
