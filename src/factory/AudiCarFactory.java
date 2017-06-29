package factory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class AudiCarFactory extends AudiFactory{
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clazz){
        AudiCar car = null;
        try{
            car = (AudiCar) Class.forName(clazz.getName()).newInstance();
        }catch(Exception e){
        }
        return (T)car;
    }
}
