package Chapter15.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class InputStreamReaderTest {
    public static void main(String[] args) {
        
        try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))){ // 보조 스트림
            
            int i = 0;
            while((i = irs.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
