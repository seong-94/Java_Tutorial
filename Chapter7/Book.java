package Chapter7;

public class Book {
    private String bookName;
    private String author;

    public Book(){}
    
    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookname){
        this.bookName = bookname;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void bookShowInfo(){
        System.out.println(bookName + "  " + author);
    }
}
