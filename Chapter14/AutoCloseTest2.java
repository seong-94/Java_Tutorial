package Chapter14;

public class AutoCloseTest2 {

    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();// 외부에서 선언 해서 사용 도 가능하다 .  
        try (obj) {// 사용할 리소스를 선언
            throw new Exception(); // 강제 예외 발생
            /** 강제로 예외를 발생 시키면 catch 블록이 수행 됩니다. */
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
