package Chapter15;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 [ENTER]를 누르세요.");


        int i;
        try {
            i = System.in.read();//read() 메서드로 한 바이트 읽는것.
            System.out.println();
            System.out.println(i + " 1 ");
            System.out.println((char)i+ " 2 ");// 문자로 변환하여 출력
        } catch (IOException e) {
        e.printStackTrace();
            //TODO: handle exception
        }
    }
    
}
