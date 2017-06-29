package builder;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildOs();

    public abstract Phone create();
}
