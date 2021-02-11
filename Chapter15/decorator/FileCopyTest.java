package Chapter15.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {

        long milliSecond = 0;
        int len = 0;

        try {
            FileOutputStream fos = new FileOutputStream("b.exe");
            FileInputStream fis = new FileInputStream("a.exe");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            milliSecond = System.currentTimeMillis(); // 파일 복사를 시작하긴 전 시간
            int i;

            while ((i = fis.read()) != -1) {
                fos.write(i);
                len++;
            }

            milliSecond = System.currentTimeMillis() - milliSecond; // 파일을 복사하는데 걸리는 시간 계산

        } catch (IOException e) {

            System.out.println(e);

        }
        System.out.println("파일을 복사하는데 " + milliSecond + " milliSecond 소요 되었습니다.");
    }
}
