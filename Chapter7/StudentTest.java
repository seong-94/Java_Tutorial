package Chapter7;

public class StudentTest {
    public static void main(String[] args) {
        Student student[] = new Student[5];

        int size = 0;
        student[0] = new Student(1001, "James");
        size++;
        student[1] = new Student(1002, "Tomas");
        size++;
        student[2] = new Student(1003, "Edward");
        size++;

        for (int i = 0; i < size; i++) {    
            student[i].showStduetnInfo();
        }

        for (int i = 0; i < size; i++) {    
            System.out.println(student[i]);
        }

    }
}
