package Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowException test = new ThrowException();
        //test.loadClass("a.txt", "java.lang.String"); // 오류 발생 3가지 옵션중 2번째는 예외를 한꺼번에 처리함.
    }                                                  // 3번 째 옵션은 각 에외 상호아마다 다른 방식으로 처리함.
}
