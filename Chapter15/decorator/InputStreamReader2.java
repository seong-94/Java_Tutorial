package Chapter15.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReader2 {
    public static void main(String[] args) {

        try (InputStreamReader irs = new InputStreamReader(System.in)) { // 보조 스트림

            int i = 0;
            while ((i = irs.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        Socket socket = new Socket();
        try {
            InputStreamReader ir = new InputStreamReader(socket.getInputStream()); // socket.getInputStream(); 은 한글만 읽을수
                                                                                   // 있음 // InputStramReader 는 다른 스트림을 받아서 문자로 변환해준다 . F1 
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
