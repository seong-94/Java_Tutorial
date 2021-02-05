package Chapter14;

public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리로스 가 close() 되었습니다.");
    }
    
}
