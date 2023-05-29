package core.code.chap2._5_5_bookshelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf; // 같은 패키지 사용 가능

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
