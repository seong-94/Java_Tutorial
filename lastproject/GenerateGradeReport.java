package lastproject;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();

    public static final String TITLE = "수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n";
    public static final String LINE = "-------------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();

        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);

    }

    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudetnList();

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStduentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajor().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectId());

            buffer.append("\n");
            buffer.append(LINE);

        }
    }

    public void getScoreGrade(Student student, int SubjectId) {
        ArrayList<Score> ScoreList = student.getScoreList();
        int majorId = student.getMajor().getSubjectId();

        GradeEvaluation[] gradeEvaluations = { new BasicEvalution(), new MajorEvaluation() };

        for (int i = 0; i < ScoreList.size(); i++) {
            Score score = ScoreList.get(i);
            if (score.getSuject().getSubjectId() == SubjectId) {
                String grade;
                if (score.getSuject().getSubjectId() == majorId) {
                    grade = gradeEvaluations[Define.SAB_Type].getGrade(score.getPoint());
                } else {
                    grade = gradeEvaluations[Define.AB_Type].getGrade(score.getPoint());
                }
                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");

            }
        }
    }

    public void makeFooter(){
        buffer.append("\n");
    }

}