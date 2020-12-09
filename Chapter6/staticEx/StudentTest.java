package Chapter6.staticEx;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("seong seok lee");
        System.out.println(student1.studentName);
        System.out.println(Student1.serialNum);
        student1.serialNum++; // The static field Student.serialNum should be accessed in a static way 는 객체
                              // 레퍼런스가 아닌 class 에 ' . ' 을 붙혀서 사용하라는 의미

        Student student2 = new Student();
        student2.setStudentName("ji su yu");
        System.out.println(student2.getStudentName());
        System.out.println(student1.serialNum);
        System.out.println(student2.serialNum);
    }
}
