package state;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class TvController implements PowerController {

    private TvState mState;

    public void setState(TvState state) {
        this.mState = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void preChannel() {
        mState.preChannel();
    }

    public void turnDown() {
        mState.turnDown();
    }

    public void turnUp() {
        mState.turnUp();
    }
}

