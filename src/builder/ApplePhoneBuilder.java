package builder;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class ApplePhoneBuilder extends Builder{
    private Phone phone = new ApplePhone();

    @Override
    public void buildCpu(String cpu){
        phone.setCpu(cpu);
    }

    @Override
    public void buildOs(){
        phone.setOs();
    }

    @Override
    public Phone create() {
        return phone;
    }
}
