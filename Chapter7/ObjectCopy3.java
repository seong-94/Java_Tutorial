package Chapter7;

public class ObjectCopy3 {
    public static void main(String[] args) {
        Book[] book1 = new Book[3];
        Book[] book2 = new Book[3];

        book1[0] = new Book("태백산백", "조정래");
        book1[1] = new Book("데이안", "헤르만 헤세");
        book1[2] = new Book("어떻게 살 것인가", "유시민");

        book2[0] = new Book(); // 디폴트 생성자로 book2 배열 인스턴스 생성
        book2[1] = new Book();
        book2[2] = new Book();

        for (int i = 0; i < book1.length; i++) {
            book2[i].setBookName(book1[i].getBookName());
            book2[i].setAuthor(book1[i].getAuthor());

        }

        for (int i = 0; i < book1.length; i++) {
            book2[i].bookShowInfo();
        }

        book1[0].setBookName("나목");
        book1[0].setAuthor("박완서");

        System.out.println("==== book1 ====");
        for (int i = 0; i < book1.length; i++) {
            book1[i].bookShowInfo();
        }

        System.out.println("=== book2 ===");
        for (int i = 0; i < book2.length; i++) {
            book2[i].bookShowInfo();
        }
        // 복사할 배열에 인스턴스를 따로 생성한 후 요소 값을 복사
        // 복사한 배열 요소는 기존 배열 요소와 서로 다른 이스턴스를 가르키므로 기존 배열의
        // 요소값이 변경 되어도 영향 을 받지 않음
    }
}
