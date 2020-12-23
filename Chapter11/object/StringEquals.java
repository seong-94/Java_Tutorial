package Chapter11.object;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 인스턴스 주소값이 같은지 비교
        System.out.println(str1.equals(str2)); // String 클래스의 equals 메서드 사용 두 인스턴싀 문자열 값이 같은지 비교
        // 주소는 다르지만 인스턴스 문자열 값이 같음 
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);   
        System.out.println(i1.equals(i2));

    }

}
