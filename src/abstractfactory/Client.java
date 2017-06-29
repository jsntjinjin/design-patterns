package abstractfactory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        factory.abstractProductA().method();
        factory.abstractProductB().method();

        AbstractFactory factory1 = new ConcreteFactoryB();
        factory1.abstractProductA().method();
        factory1.abstractProductB().method();
    }
}
