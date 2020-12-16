package Chapter8.cirtualFunction;

public class TestA {
    int num;

    void aaa() {
        System.out.println("aaa() print");

    }

    public static void main(String[] args) { // maint 함수가 실행되면 지역 변수는 스택메모리에 위치합니다.
        // 메서드를 호출할때에는 메서드 영혀의 주소를 참조하여 명령을 실행 하기 때문에 인스턴스가 달라도 동일한 메어스가 호출됩니다.
        TestA a1 = new TestA();
        a1.aaa();
        TestA a2 = new TestA();
        a2.aaa();
    }

}
