package Chapter7;

import java.util.ArrayList; //  import ArrayList class
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> libray = new ArrayList<Book>(); // declear ArrayList

       
        libray.add(new Book("태백산맥", "조정래"));
        libray.add(new Book("데미안", "헤르만 헤세"));
        libray.add(new Book("어떻게 살 것인가", "유시민"));
        libray.add(new Book("토지", "박경리"));
        libray.add(new Book("어린왕자", "생텍쥐페리"));
        libray.add(new Book("어린왕자", "생텍쥐페리"));
        libray.add(new Book("어린왕자", "생텍쥐페리"));


        
        for (int i = 0; i < libray.size(); i++) {
            Book book = libray.get(i);
            book.bookShowInfo();
        }

        System.out.println();


        System.out.println("=== Enhanced For Loop ===");
        for(Book book: libray){
            book.bookShowInfo();
        }
    }

}
