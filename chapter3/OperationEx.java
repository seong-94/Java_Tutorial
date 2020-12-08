package chapter3;

public class OperationEx {
    public static void main(String[] args) {
        int num = 0B00000101; // 0101 --> 5

        System.out.println(num >> 2); // 0101 --> 0001 -> 1
        System.out.println(num << 2); // 0101 --> 0001 0100 --> 20
        System.out.println(num >>> 2);//

        System.out.println(num);

        num = num << 2;

        System.out.println(num);

    }
}
