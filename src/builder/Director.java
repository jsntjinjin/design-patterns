package builder;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String cpu) {
        builder.buildCpu(cpu);
        builder.buildOs();
    }
}
