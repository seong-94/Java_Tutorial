package Chapter13.lamda;



public class TestLamda {
    public static void main(String[] args) {
        /** 람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출 */
        PrintString lamdaStr = s -> System.out.println(s);
        PrintString reStr = returnString();
    
        //lamdaStr.showString("hell lamda_1");
        //showMyString(lamdaStr);

        reStr.showString("hello");

    }
    public static void showMyString(PrintString p){
        p.showString("hello lamda_2");

    }
    /** 람다식을 반환 하는 메서드 */
    public static PrintString returnString(){
        return s -> System.out.println(s + " World");
    }
}

interface PrintString {
    void showString(String str);
}
