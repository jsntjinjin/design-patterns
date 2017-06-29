package memento;

/**
 * Created by jinjin on 2017/6/26.
 * Description：备忘录类
 */
public class Memoto {

    private String text;

    public Memoto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Memoto{" +
                "text='" + text + '\'' +
                '}';
    }
}
