package builder;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new ApplePhoneBuilder();
        Director director = new Director(builder);
        director.construct("A11");
    }
}
