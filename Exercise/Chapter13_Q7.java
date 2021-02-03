package Exercise;

import java.util.ArrayList;
import java.util.List;



public class Chapter13_Q7 {
    public static void main(String[] args) {
        List<Book> booklist = new ArrayList<>();

        booklist.add(new Book("자바",25000));
        booklist.add(new Book("파이썬",15000));
        booklist.add(new Book("C언어",35000));

        int total = booklist.stream().mapToInt(b ->b.getPrice()).sum();
        System.out.println(total);
        System.out.println();

        booklist.stream().filter(p ->p.getPrice() >= 20000).forEach(c ->System.out.print(c.getName() +" "+ c.getPrice()+ " "));

    }
}
class Book{
    private String name;
    private int price;

    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
