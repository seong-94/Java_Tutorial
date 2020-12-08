package chapter3;

public class Chapter3_Test {
    public static void main(String[] args) {
        int myAge = 23;
        int teacherAge = 38;

        boolean value = (myAge > 25);
        System.out.println(value);

        System.out.println(myAge <= 25);
        System.out.println(myAge == teacherAge);

        String ch;
        ch = (myAge > teacherAge) ? "True" : "False";
        System.out.println(ch);

        int num = 8;
        System.out.println(num += 10);
        System.out.println(num -= 10);
        System.out.println(num >>= 2);
    }

}
