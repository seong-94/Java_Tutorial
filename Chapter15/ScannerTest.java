package Chapter15;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Name : ");
        String name = scanner1.nextLine();
        System.out.println("Job : ");
        String job = scanner1.nextLine();
        System.out.println("ID : ");
        int num = scanner1.nextInt();


        System.out.println(name);
        System.out.println(job);
        System.out.println(num);
    }
}
