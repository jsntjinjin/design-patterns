package mediator;

/**
 * Created by jinjin on 2017/7/1.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();

        CPU cpu = new CPU(mainBoard);
        CDDevice cdDevice = new CDDevice(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        cdDevice.load();
    }
}
