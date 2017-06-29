package factory;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        AudiFactory factory = new AudiCarFactory();

        BlueCar blueCar = factory.createAudiCar(BlueCar.class);
        blueCar.color();
        RedCar redCar = factory.createAudiCar(RedCar.class);
        redCar.color();
    }
}
