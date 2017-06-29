package cloneable;

/**
 * Created by jinjin on 2017/6/29.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        WordDoc originDoc = new WordDoc();
        originDoc.setText("原型文档");
        originDoc.setImage("图片1");
        originDoc.setImage("图片2");
        originDoc.showDoc();

        WordDoc doc = originDoc.clone();
        doc.showDoc();
        doc.setText("修改之后的文档");
        doc.showDoc();

        originDoc.showDoc();
    }
}
