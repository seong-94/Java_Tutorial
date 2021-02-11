package Chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
         int i= 0;
        try {
            fis = new FileInputStream("/input1.txt");// input.txt 파일 입력 스트림 생성 // 이유는 모르겟지만 VS CODE 에서는 최상위 폴더에 txt 파일을 생성해야지
            while ((i = fis.read()) != -1);                                  // 열린다.
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close(); // 열린 스트림은 finally 블록에서 닫음
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) { // 스트림이 null 인경우
                System.out.println(e);
            }
        }
        System.out.println("END");
    }
}
