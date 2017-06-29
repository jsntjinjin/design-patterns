package observer;

/**
 * Created by jinjin on 2017/6/22.
 * Description：
 */
public class Test {

    public static void main(String[] args) {

        // 被观察者
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        // 观察者
        Coder coder1 = new Coder("张三");
        Coder coder2 = new Coder("李四");
        Coder coder3 = new Coder("王五");
        Coder coder4 = new Coder("赵六");

        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        devTechFrontier.addObserver(coder4);

        devTechFrontier.postNewPublication("新的一期开发技术周报发布了！");

    }
}
