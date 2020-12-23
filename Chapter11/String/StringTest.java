package Chapter11.String;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println((str1 == str2));// 인스턴스가 매번 새로 생성 되어 주소값이 다름
        System.out.println(str1.equals(str2));// 문자열은 같으므로true 반환 

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);// 상수 풀 자체의 주소를 가져오기떄문에 동일 
        System.out.println(str3.equals(str4));//문자열 또한 같기 떄문에 true
    }
}
