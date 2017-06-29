package memento;

/**
 * Created by jinjin on 2017/6/26.
 * Description：
 */
public class Note {

    public static void main(String[] args) {
        NoteCaretaker caretaker = new NoteCaretaker();

        saveMemoto("第1条记录", caretaker);
        saveMemoto("第2条记录", caretaker);
        saveMemoto("第3条记录", caretaker);
        saveMemoto("第4条记录", caretaker);
        saveMemoto("第5条记录", caretaker);
        saveMemoto("第6条记录", caretaker);
        saveMemoto("第7条记录", caretaker);
        saveMemoto("第8条记录", caretaker);
        saveMemoto("第9条记录", caretaker);

        System.out.println("获取前一条数据 ->" + caretaker.getPreMemoto().toString());
        System.out.println("获取前一条数据 ->" + caretaker.getPreMemoto().toString());
        System.out.println("获取前一条数据 ->" + caretaker.getPreMemoto().toString());
        System.out.println("获取前一条数据 ->" + caretaker.getPreMemoto().toString());
        System.out.println("获取后一条数据 ->" + caretaker.getNextMemoto().toString());
        System.out.println("获取后一条数据 ->" + caretaker.getNextMemoto().toString());
        System.out.println("获取后一条数据 ->" + caretaker.getNextMemoto().toString());

        saveMemoto("第10条记录", caretaker);

        System.out.println("获取前一条数据 ->" + caretaker.getPreMemoto().toString());
    }

    private static void saveMemoto(String text, NoteCaretaker caretaker) {
        Memoto memoto = new Memoto(text);
        caretaker.saveMemoto(memoto);
    }
}
