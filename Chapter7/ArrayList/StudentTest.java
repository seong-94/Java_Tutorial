package Chapter7.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "Lee");
        student1.addSubject("Korean", 100);
        student1.addSubject("Math", 50);

        Student student2 = new Student(1002, "Yu");
        student2.addSubject("Korea", 70);
        student2.addSubject("Math", 85);
        student2.addSubject("English", 100);

        student1.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();

    }
}
