package lastproject;

public class TestMain {
    School goodschool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();
    public static void main(String[] args)   {
        TestMain test = new TestMain();
        /**
         * createSubject() --> 먼저 생성을 해야지만 학생의 인자를 넣을수 있기떄문에 순서가 중요하다.
         * 학생을 먼저 만든다고 해도 넣을 수있는 과목이 존재 하지 않기 떄문에 오류가 난다.
         * 그래서 과목을 먼저 생성한다.
         * 클래스는 그냥 틀일 뿐 이다. new 로 뽑아야 함
         */
        test.creatSubject();
        test.creatStudent();
        
        String report = test.gradeReport.getReport();
        System.out.println(report);
        
    }
    public void creatSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);
        
        goodschool.addSubjectList(math);
        goodschool.addSubjectList(korean);
    }
    public void creatStudent() {
        Student student1 = new Student(181213, "안", korean);
        Student student2 = new Student(181215, "이", math);
        Student student3 = new Student(181123, "박", korean);
        Student student4 = new Student(180119, "김", korean);
        Student student5 = new Student(180223, "최", math);
        
        goodschool.addStudentList(student1);
        goodschool.addStudentList(student2);
        goodschool.addStudentList(student3);
        goodschool.addStudentList(student4);
        goodschool.addStudentList(student5);
        
        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);
        
        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);
        
        
        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);
        
        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);
        
        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 80);
        
        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);
        
        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
        
    }
    
    
    
    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScoere(score);
    }
    
    
    
}
