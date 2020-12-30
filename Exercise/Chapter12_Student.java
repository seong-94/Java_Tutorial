package Exercise;

import java.util.HashSet;

public class Chapter12_Student  {
    private int studentId;
    private String studentName;
    private HashSet<Chapter12_Student> hashSet; // hashSet 선언

    public Chapter12_Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        hashSet = new HashSet<>();
    }

    public int getStduetnId() {
        return studentId;
    }

    public void setStduetnId(int stduetnId) {
        this.studentId = stduetnId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentName + " : " + studentId;
    }

    public void showAllMember() {
        for (Chapter12_Student ChS : hashSet) {
            System.out.println(ChS);
        }
        System.out.println();
    }

   
    public void showStudentInfo() {
        System.out.println("Name : " + studentName + " ID : " + studentId);
    }

}
