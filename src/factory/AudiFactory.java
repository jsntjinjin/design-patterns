package factory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public abstract class AudiFactory{
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clazz);
}
