package Chapter6.staticEx;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 student1 = new Student2();
        student1.setStudentName("seong Seok Lee");
        System.out.println(Student2.getSerialNum());
     //   System.out.println(student1.getstudentName() +"  "+ student1.getSerialNum());

        Student2 student2 = new Student2();
        student2.setStudentName("ji su yu");
        System.out.println(Student2.getSerialNum());
      //  System.out.println(student2.getstudentName() +" " +student2.getSerialNum());

    }
}
