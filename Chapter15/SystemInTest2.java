package Chapter15;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러개를 쓰고 [ENTER]를 누르세요.");

        int i;
        try {
            i = System.in.read();
            while ((i = System.in.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
