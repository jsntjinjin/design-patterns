package mediator;

/**
 * Created by jinjin on 2017/7/1.
 * Description：
 */
public class CPU extends Colleague {

    private String dataVideo, dataSound;


    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    /**
     * 解码音频和视频
     * @param data
     */
    public void decodeData(String data) {
        String[] split = data.split(",");
        dataVideo = split[0];
        dataSound = split[1];
        mediator.changed(this);
    }
}
