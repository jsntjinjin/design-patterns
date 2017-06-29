package responsibility;

/**
 * Created by jinjin on 2017/6/19.
 * Description：抽象领导类
 */
public abstract class Leader {

    // 上一级领导
    protected Leader nextHandler;

    /**
     * 处理报账请求
     * @param money 需要报销的钱
     */
    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }

    /**
     * 自身能批复的额度
     * @param money
     */
    public abstract void handle(int money);

    /**
     * 处理报账行为
     * @return
     */
    public abstract int limit();

}
