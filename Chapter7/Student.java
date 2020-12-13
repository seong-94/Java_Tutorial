package Chapter7;

public class Student {
    int studentID;
    String studentName;

    // public Student() {
    // }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName (){
        return studentName;
    }
    public void showStduetnInfo() {
        System.out.println(studentID + "  " + studentName);
    }
}
