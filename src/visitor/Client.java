package visitor;

/**
 * Created by jinjin on 2017/6/30.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();

        report.showReport(new CEOVisitor());

        report.showReport(new CTOVisitor());
    }
}
