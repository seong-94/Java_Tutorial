package Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHanding3 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally { // return 문 과 상관 없이 finally 는 항상 수행 됩니다.
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행 됩니다.");
        }
        System.out.println("여기도 수행 됩니다.");
    }
}
