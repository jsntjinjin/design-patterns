package iterator;

/**
 * Created by jinjin on 2017/6/27.
 * Description：
 */
public class Boss {

    public static void main(String[] args) {
        CompanyA companyA = new CompanyA();
        Iterator iteratorA = companyA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next().toString());
        }

        CompanyB companyB = new CompanyB();
        Iterator iteratorB = companyB.iterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next().toString());
        }
    }
}
