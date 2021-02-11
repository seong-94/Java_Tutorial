package Chapter15.decorator;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutStreamTest {
    public static void main(String[] args) {
        
        try (FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos) ){
                dos.write(100); // writeInt 는 4byte 짜리  write는 1 byte
                dos.writeInt(10);
                dos.writeChar('a');
                dos.writeUTF("hello");
                
        } catch (Exception e) {
            System.out.println(e);
        }
        try(FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fis) ) {
            System.out.println( dis.read());
            System.out.println( dis.readInt());
            System.out.println( dis.readChar());
            System.out.println( dis.readUTF());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
