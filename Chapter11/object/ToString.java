package Chapter11.object;

public class ToString {
    public static void main(String[] args) {
        Book book1 = new Book(200, "Ant");

        System.out.println(book1);
        System.out.println(book1.toString());

    }
}

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String booktitle) { // 생성자 constructor
        this.bookNumber = bookNumber;
        this.bookTitle = booktitle;
    }

    @Override
    public String toString() {// toString method 를 재정의 해서 사용함.
        return bookTitle + "  " + bookNumber;
    }
}