package command;

/**
 * Created by jinjin on 2017/6/21.
 * Description：
 */
public class Player {

    public void main(String[] args) {
        // 首先构建俄罗斯方块的游戏
        TetrisMachine machine = new TetrisMachine();

        // 构造4种命令
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FallCommand fallCommand = new FallCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        // 构造button按钮
        Button button = new Button();
        button.setLeftCommand(leftCommand);
        button.setRightCommand(rightCommand);
        button.setFallCommand(fallCommand);
        button.setTransformCommand(transformCommand);

        // 执行具体操作
        button.toLeft();
        button.toRight();
        button.fall();
        button.transform();
    }
}
