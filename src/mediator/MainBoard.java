package mediator;

/**
 * Created by jinjin on 2017/7/1.
 * Description：
 */
public class MainBoard extends Mediator {
    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    @Override
    public void changed(Colleague c) {
        if (c == cdDevice) {
            handleCD((CDDevice) c);
        } else if (c == cpu) {
            handleCPU((CPU) c);
        }
    }

    /**
     * 处理cpu读取数据后与其他设备的交互
     * @param cpu
     */
    private void handleCPU(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     * @param cdDevice
     */
    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
