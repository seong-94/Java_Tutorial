package Chapter6.staticEx;

public class Alone_code {
    public static void main(String[] args) {
        Student3 student1 = new Student3();
        student1.setStudentName("Seong Seok Lee");
        System.out.println(student1.getStudentName() + "  " + Student3.getCardNum());
        
        Student3 student2 = new Student3();
        student2.setStudentName("ji su yu");
        System.out.println(student2.getStudentName() + "  " +Student3.getCardNum());
       
        

    }

    public static class Student3 {
        private static int cardNum = 1000;
        int studentID;
        String studentName;

        Student3() {
            cardNum += 100;
            studentID = cardNum;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public static int getCardNum() {
            return cardNum;

        }

        public void setCardNum(int cardNum) {
            Student3.cardNum = cardNum;
        }
    }
}
