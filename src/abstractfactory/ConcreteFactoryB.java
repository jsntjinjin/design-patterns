package abstractfactory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public AbstractProductA abstractProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB abstractProductB() {
        return new ConcreteProductB2();
    }
}
