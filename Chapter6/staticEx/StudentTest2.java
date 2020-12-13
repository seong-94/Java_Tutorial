package Chapter6.staticEx;

public class StudentTest2 {

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.setStudentName("seong seok lee");
       // System.out.println(student1.serialNum);// The static field Student.serialNum should be accessed in a static way
                                               // 는 객체 레퍼런스가 아닌 class 에 ' . ' 을 붙혀서 사용하라는 의미 student1 (X) --> Student1 (0)
        System.out.println(student1.studentName + "seriaNumber is " + Student1.serialNum);

        Student1 student2 = new Student1();
        student2.setStudentName("ji su yu");
        System.out.println(student2.getStudentName());
        System.out.println(Student1.serialNum +"  "+ student2.getStudentName());
        System.out.println(Student1.serialNum);
    }
}
