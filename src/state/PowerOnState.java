package state;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class PowerOnState implements TvState {

    @Override
    public void nextChannel() {
        System.out.println("下个频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上个频道");
    }

    @Override
    public void turnDown() {
        System.out.println("音量变低");
    }

    @Override
    public void turnUp() {
        System.out.println("音量变高");
    }
}
