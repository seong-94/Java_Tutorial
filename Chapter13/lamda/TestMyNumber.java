package Chapter13.lamda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이형 max 변수에 대입
        //MyNumber add = (x, y) -> x + y;
        
        System.out.println(max.getMax(1, 20));// 인터페이스형 변수로 메서드 호출
        System.out.println();
    };
}
