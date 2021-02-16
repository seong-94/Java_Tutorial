package lastproject;

import java.util.ArrayList;

public class School {
    private static School instance = new School();

    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    private School() {
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }
    
    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudentList(Student student){
        studentList.add(student);
    }
    public void addSubjectList(Subject subject){
        subjectList.add(subject);
    }
    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
