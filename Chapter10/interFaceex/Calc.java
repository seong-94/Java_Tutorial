package Chapter10.interFaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -9999999;

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    default void description() {
        System.out.println("정수 계산기 를 구현합니다.");
        myMethod();
    }
    private void myMethod(){
        System.out.println("private method");
    }
    private static void myStaticMethod(){
        System.out.println("private static method");
    }

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int time(int num1, int num2);

    int divide(int num1, int num2);

}
