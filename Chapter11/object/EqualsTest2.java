package Chapter11.object;

public class EqualsTest2 {
    public static void main(String[] args) {

    }

}

class Student1 {
    int studentId;
    String studentName;

    public Student1(int studentId, String studentName) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String toString() {
        return studentId + "  " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student1) {
            Student1 std = (Student1) obj;
            if (this.studentId == std.studentId)
                return true;
        } else {
            return false;
        }
        return false;
    }
}
