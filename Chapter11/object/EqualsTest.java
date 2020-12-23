package Chapter11.object;

public class EqualsTest {
    public static void main(String[] args) {
        Student student1 = new Student(11, "lee");
        Student student2 = new Student(22, "kim");
        Student student3 = new Student(11, "lee");



        if(student1 == student2) {
            System.out.println("student1 and student2's address are eqaul");
            
        } else {
            System.out.println("student1 and student2's address are not equal");
        }
        if(student1.equals(student2)) {
            System.out.println("student1 and student2's Name are eqaul");
            
        } else {
            System.out.println("student1 and student2's Name are not equal");
        }
        if(student1 == student3) { // 인스턴스의 주소가 다르기 때문에 같지않음.
            System.out.println("student1 and student3's address are eqaul");
            
        } else {
            System.out.println("student1 and student3's address are not equal");
        }
        if(student1.studentName.equals(student3.studentName)) {
            System.out.println("student1 and student3's Name are eqaul");
            
        } else {
            System.out.println("student1 and student3's Name are not equal");
        }
    }
}

class Student{
    int stundenId;
    String studentName;

    public Student(int studentId,String studentName){
        this.studentName = studentName;
        this.stundenId = studentId;
    }

    public String toString(){
        return stundenId + "  " + studentName;
    }
    
}
