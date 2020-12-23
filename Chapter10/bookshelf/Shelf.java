package Chapter10.bookshelf;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf; // 자료를 순서대로 저장할 ArrayList 선언

    public Shelf(){
        shelf  = new ArrayList<String>();// default constructor 로 Shelf 클래스를 생성하면 ArryList도 생성됨

    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
