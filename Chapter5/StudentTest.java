package Chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";
        studentAhn.studentID = 44502699;

        Student student2 = new Student();
        student2.setStudentName("안승연");


        System.out.println(studentAhn.getStudentName());
        System.out.println(studentAhn.studentID);

        System.out.println(student2.getStudentName());
        System.out.println(student2.studentName);

    }
}
