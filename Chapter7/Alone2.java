package Chapter7;

import java.util.ArrayList;

public class Alone2 {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<Student>();

        student.add(new Student(1001, "James"));
        student.add(new Student(1002, "Tomas"));
        student.add(new Student(1003, "Edward"));

        for (int i = 0; i < student.size(); i++) {
            Student studentlist = student.get(i); // studentlist 을 새롭게 만들어서 student의 정보를 받음
            studentlist.showStduetnInfo();

        }
        System.out.println();

        for (Student studentlist : student) { // Enhanced for Loop
            studentlist.showStduetnInfo();
        }

    }
}
