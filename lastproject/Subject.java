package lastproject;

import java.util.ArrayList;


public class Subject {

    private String subjectName;
    private int subjectId;
    private int gradeType;

    private ArrayList<Student> studetnList = new ArrayList<>();

    /**
     * 이 과목을 수강 신청 하는 학생리스트
     * register() 메서드를 호출하여 리스트에
     * 추가 됩니다.
     * @param student
     */
    public void register(Student student){ 
        studetnList.add(student);
    }

    public Subject(String subjectName,int subjectId,int gradeType) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = gradeType;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public ArrayList<Student> getStudetnList() {
        return studetnList;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setStudetnList(ArrayList<Student> studetnList) {
        this.studetnList = studetnList;
    }
}
