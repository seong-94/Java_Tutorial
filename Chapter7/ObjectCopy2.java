package Chapter7;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book book1[] = new Book[3];
        Book book2[] = new Book[3];

        book1[0] = new Book("태백산백", "조정래");
        book1[1] = new Book("데이안", "헤르만 헤세");
        book1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(book1, 0, book2, 0, 3);

        for (int i = 0; i < book2.length; i++) {
            book2[i].bookShowInfo();
        }

        System.out.println("=== book1 ====");
        book1[0].setBookName("나목");
        book1[0].setAuthor("박완서");

        
        for(int i = 0; i < book1.length ; i++){
            book1[i].bookShowInfo();
        }

        System.out.println("=== book2 ====");
        for(int i = 0; i < book2.length ; i++){
            book2[i].bookShowInfo();
        }
    }
}
