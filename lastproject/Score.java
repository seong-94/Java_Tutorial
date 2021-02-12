package lastproject;

public class Score {

    private int studentId; // 학번
    private Subject subject; // 과목
    private int point; // 점수

    Score() {
    }

    public Score(Subject subject, int point, int studentId) {
        this.point = point;
        this.studentId = studentId;
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public int getStudentId() {
        return studentId;
    }

    public Subject getSuject() {
        return subject;
    }

    public void setSuject(Subject suject) {
        this.subject = suject;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        
		return "학번 : " +studentId+ " , " + subject.getSubjectName() + " : " + point;
    }
}
