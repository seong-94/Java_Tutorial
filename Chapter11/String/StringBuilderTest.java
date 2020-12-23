package Chapter11.String;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소" + System.identityHashCode(javaStr));// 처음 생성 되었을때 주소

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연사 전 buffer 메모리 주소 :" + System.identityHashCode(buffer));

        buffer.append(" and"); // 문자열 추가
        buffer.append(" android"); // 문자열 추가
        buffer.append(" programming is fun!!!");// 문자열 추가
        System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));

        javaStr = buffer.toString(); // String 클래스로 변환
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

    }
}
