package builder;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public abstract class Phone {
    protected String mCpu;
    protected String mOs;

    public void setCpu(String cpu){
        this.mCpu = cpu;
    }

    public abstract void setOs();

}
