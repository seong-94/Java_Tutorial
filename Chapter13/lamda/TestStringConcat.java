package Chapter13.lamda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        StringConcatImol concat = new StringConcatImol();
        concat.makeString(s1, s2);

        System.out.println();

        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v); // 람다식 으로 인터페이스 구현
        concat2.makeString(s1, s2);
    }
}
