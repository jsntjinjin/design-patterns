package command;

/**
 * Created by jinjin on 2017/6/21.
 * Description：向左的命令
 */
public class LeftCommand implements Command {

    // 持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
