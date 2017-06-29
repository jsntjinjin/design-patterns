package command;

/**
 * Created by jinjin on 2017/6/21.
 * Description：向右的命令
 */
public class RightCommand implements Command {

    // 持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
