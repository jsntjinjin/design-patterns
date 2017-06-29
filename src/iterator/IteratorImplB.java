package iterator;

/**
 * Created by jinjin on 2017/6/27.
 * Description：
 */
public class IteratorImplB implements Iterator {

    private Employee[] employees;
    private int position;

    public IteratorImplB(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return !(position > employees.length - 1 || employees[position] == null);
    }

    @Override
    public Object next() {
        Employee employee = employees[position];
        position++;
        return employee;
    }

}
