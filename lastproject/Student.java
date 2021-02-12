package lastproject;

import java.util.ArrayList;

public class Student {

    private String name;
    private int studentId;
    private Subject major;
    /**
     * 학생이 수강한 과목의 리스트 addSubjectScore()메서드가 호출
     * 되면 이 리스에 추가됨.
     */

    private ArrayList<Score> scoreList = new ArrayList<>(); 
    
    public void addSubjectScoere(Score score) {
        scoreList.add(score);
    }

    Student() {
    }

    public Student(String name, Subject major, int studentId) {

        this.name = name;
        this.studentId = studentId;
        this.major = major;

    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public Subject getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
