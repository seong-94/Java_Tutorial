package Chapter7.ArrayList;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList; // declear ArrayList

    
    public Student(int studentID, String studentName){ // 생성자 constructor jmn
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }
        
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    
    public void showStudentInfo(){
        int total = 0;
        for(Subject subjectarr : subjectList){
            total += subjectarr.getScore();
            System.out.println("student : "+ studentName );
            System.out.println("subject :" + subjectarr.getName() + " subjectscore "+ subjectarr.getScore());
        }
        System.out.println("toatla score is " + total);
    }


}

