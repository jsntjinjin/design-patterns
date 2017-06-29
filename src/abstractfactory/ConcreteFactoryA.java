package abstractfactory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public AbstractProductA abstractProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB abstractProductB() {
        return new ConcreteProductB1();
    }
}
