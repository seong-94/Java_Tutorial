package Chapter15;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {


        byte[] bs = new byte[26];
        byte data = 65;
        for(int i = 0 ; i < bs.length ; i++){
            bs[i] = data++;
        }  
        try (FileOutputStream fos = new FileOutputStream("output.txt" )) { // 붙혀서 쓰고싶면 true 디폴트 값은 false
            fos.write(bs); // 아스키 코드로 인해서 ABC 들어간다 숫자 그대로 넣고 싶으면 다른 거 써야함
            


        } catch (Exception e) {
            System.out.println(e);
        } 
        System.out.println("END");
    }
}
