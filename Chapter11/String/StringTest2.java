package Chapter11.String;

public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidstr = new String("java");

        System.out.println(javaStr);
        System.out.println("처음 문자열 값 주소 " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidstr);

        System.out.println(javaStr);
        System.out.println("연결된 주소값: "+ System.identityHashCode(javaStr));

    }
}
