package Chapter13.innerclass;

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10); //getRunnable () 메서드의 호출이 끝남
        runner.run(); // run() 실행 되면서 getRunnable() 메서드의 지역 변수가 사용됨
    }
}

class Outer {
    int outNum = 50;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100; // local variable

        class MyRunnable implements Runnable { // local inner class
            int localNum = 100; // local inner class instance variable

            @Override
            public void run() {
                /*
                 * num = 200; // 지역 변수 는 상수로 바뀌므로 값을 변경할수 없어 오류 발생합니다. i = 100;
                 */
                // 매개 변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할수 없어 오류 발생합니다.

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + " (외부 클래스 정적 변수 )");
            }
        }
        return new MyRunnable();// 지역 내부 클래스 이름은 클래스를 생성하여 반환할때만 사용함

    }

}
