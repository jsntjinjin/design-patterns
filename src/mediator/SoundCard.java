package mediator;

/**
 * Created by jinjin on 2017/7/1.
 * Description：
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频 -> " + data);
    }
}
