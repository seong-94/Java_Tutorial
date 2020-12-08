package chapter3;

public class OpearationEx4 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';// if fatherAge is greater than motherAge is true but motherAge is
                                                 // greater than fatherAge so the answer is False

        System.out.println(ch);
    }
}
