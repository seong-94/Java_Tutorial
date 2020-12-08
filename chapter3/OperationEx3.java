package chapter3;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 논리곱 에서 앞의 항이 거짓이기떄문에 실행 되지 않음 

  
        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 논리합 에서 앞의 항이 참이기떄문에 실행 되지 않음
    
    }
}
