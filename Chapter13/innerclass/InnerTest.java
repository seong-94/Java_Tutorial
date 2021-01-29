package Chapter13.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;
        // static int sInNum = 200; // 외부 클래스 디폴트 생성자.외부 클래스 가 생성된 후에 내부 클래스 생성 가능

        void inTest() {
            System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수)");
        }
       
    
    }
    public void usingClass() {
        inClass.inTest();
    }

}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부클래스 기능 호출");

        outClass.usingClass();
    }
}
