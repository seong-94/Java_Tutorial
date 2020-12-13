package Chapter7;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] libray = new Book[5];

        libray[0] = new Book("태백산맥", "조정래");
        libray[1] = new Book("데미안", "헤르만 헤세");
        libray[2] = new Book("어떻게 살 것인가", "유시민");
        libray[3] = new Book("토지", "박경리");
        libray[4] = new Book("어린왕자", "생텍쥐페리");

        for (int i = 0; i < libray.length; i++) {
            System.out.println(libray[i]);
        }
        for (int i = 0; i < libray.length; i++) {
            libray[i].bookShowInfo();
        }
        
    }
}
