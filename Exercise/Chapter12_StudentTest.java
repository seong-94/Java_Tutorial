package Exercise;

import java.util.HashSet;

public class Chapter12_StudentTest {
    public static void main(String[] args) {
        HashSet<Chapter12_Student> set = new HashSet<>();

        set.add(new Chapter12_Student(100, "홍"));
        set.add(new Chapter12_Student(200, "강"));
        set.add(new Chapter12_Student(300, "이"));
        set.add(new Chapter12_Student(400, "정"));
        set.add(new Chapter12_Student(100, "홍"));

        System.out.println(set);
    }
}
