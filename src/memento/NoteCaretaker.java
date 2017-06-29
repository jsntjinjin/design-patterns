package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinjin on 2017/6/26.
 * Description：管理Memoto
 */
public class NoteCaretaker {

    private static final int MAX = 30;

    List<Memoto> memotos = new ArrayList<>();

    private int mCurrentIndex = 0;

    public void saveMemoto(Memoto memoto) {
        if (memotos.size() > MAX) {
            memotos.remove(0);
        }
        memotos.add(memoto);
        mCurrentIndex = memotos.size() - 1;
    }

    public Memoto getPreMemoto() {
        mCurrentIndex = mCurrentIndex > 0 ? --mCurrentIndex : mCurrentIndex;
        return memotos.get(mCurrentIndex);
    }

    public Memoto getNextMemoto() {
        mCurrentIndex = mCurrentIndex < memotos.size() - 1 ? ++mCurrentIndex : mCurrentIndex;
        return memotos.get(mCurrentIndex);
    }

}
