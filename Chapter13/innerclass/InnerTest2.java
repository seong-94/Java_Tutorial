package Chapter13.innerclass;

public class InnerTest2 {
    public static void main(String[] args) {

        /* 외부 클래스를 생성 하지 않고 바로 정적 내부 클래스 생성가능 */
        OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();

        sInClass.inTest();
        System.out.println();
        System.out.println("정적 내부 클래스이 정적 메서드 호출");

        System.out.println();
        OutClass2.InStaticClass.sTest();

    }
}

class OutClass2 {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        /* 정적 내부 클래스의 일반 메서드 */

        void inTest() {
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
        }

        /* 정적 내부 클래스의 정적 메서드 */
        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용");
            System.out.println("OutClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용");
        }
    }

    public OutClass2() {
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
