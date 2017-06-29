package state;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.turnUp();
        controller.nextChannel();
        controller.turnDown();
        controller.powerOff();
    }
}
