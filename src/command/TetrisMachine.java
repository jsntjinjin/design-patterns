package command;

/**
 * Created by jinjin on 2017/6/21.
 * Description：接收者角色 -> 真正执行操作的角色
 */
public class TetrisMachine {

    public void toLeft() {
        System.out.println("向左");
    }

    public void toRight() {
        System.out.println("向右");
    }

    public void fastToBottom() {
        System.out.println("快速落下");
    }

    public void transform() {
        System.out.println("改变形状");
    }
}
