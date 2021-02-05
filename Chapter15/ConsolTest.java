package Chapter15;

import java.io.Console;

public class ConsolTest {
    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("이름 : ");
        String name = console.readLine();
        System.out.println("직업 :");
        String job = console.readLine();
        System.out.println("비밀 번호 : ");
        char[] password = console.readPassword();

        System.out.println(name);
        System.out.println(job);
        System.out.println(password);
        
    }
}
