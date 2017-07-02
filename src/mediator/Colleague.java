package mediator;

/**
 * Created by jinjin on 2017/7/1.
 * Description：
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
