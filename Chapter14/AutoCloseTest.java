package Chapter14;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseObj obj = new AutoCloseObj()) {// 사용할 리소스를 선언 
            throw new Exception(); //강제 예외 발생 
            /** 강제로 예외를 발생 시키면 catch 블록이 수행 됩니다. */
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
