package Chapter5;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;
    public Student(){}
    public void showInfo() {//method 
        System.out.println(studentName + "," + address);
    }

    public void setStudentName(String name){
        studentName = name;
    }
    
    public String getStudentName(){
        return studentName;
    }
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
    public Student (int studentID){
        this.studentID = studentID;
    }

}
