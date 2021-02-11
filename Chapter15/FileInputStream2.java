package Chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStream2 {

    public static void main(String[] args) {
        FileReader fis = null;
        int i = 0;
        try {
            /* FileReader --> 문장을 읽을때 유용함
             * FileInputStream --> 단어 하나 하나 읽을때 유용함.
             */
            fis = new FileReader("11.txt");// input.txt 파일 입력 스트림 생성 // 이유는 모르겟지만 VS CODE 에서는 최상위 폴더에 txt 파일을
                                           // 생성해야지 열린다.
            while ((i = fis.read()) != -1) {

                System.out.print((char)i);
            }

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
        System.out.println();
        System.out.println("END");
    }
}
