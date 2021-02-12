package Chapter15.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileAccessTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        /*"파일포인터"는 해당 파일의 처음에 위치하게 된다. 일포인터"는 해당 파일의 마지막에 위치하게 된다.
         * : 성공적으로 열린 "파일포인터"를 인자로 전달받아 해당 파일에 대한 연결을 해제한다. 
         * 문자를 반환한다.
         */
        rf.writeInt(100); // 4 byte
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        rf.writeDouble(3.14); //8 byte
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        rf.writeUTF("하이"); // 3 * 2 + null(2 byte)
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        /** 
         * 4 --> + 8 = 12 --> 12 + 8 = 20 
         * 
         */

        rf.seek(0); // 파일 포인터를 다시 처음으로 옮겨 줘야지 제대로 됀 파일을 읽을수 있다.
        /** 
         * 파일 포인터어 20 까지 이동한뒤에 EOFE Exception 이 뜨기때문에 파일포인터 초기화를 해야한다.
         */
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        
        int i = rf.readInt();
        double b = rf.readDouble();
        String str = rf.readUTF();
        
        System.out.println(i);
        System.out.println(b);
        System.out.println(str);

        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());

    }
}
