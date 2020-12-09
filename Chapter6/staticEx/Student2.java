package Chapter6.staticEx;

public class Student2 {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    Student2(){
        serialNum++;
        studentID = serialNum;
    }

    public String getstudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public static int getSerialNum(){
        return serialNum;
    }
    public static void setSerialNum(int serialNum){
        Student2.serialNum = serialNum;
    }   
}
