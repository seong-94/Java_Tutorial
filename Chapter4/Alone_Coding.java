package Chapter4;

public class Alone_Coding {
    public static void main(String[] args) {
        int Score =90;
        char grade;

        if(Score <100 && Score >=90){
            grade = 'A';
        }else if (Score <89 && Score >=80){
            grade = 'B';
        }else if (Score <79 && Score >=70){
            grade = 'C';
        }else if (Score <69 && Score >=60){
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println(grade);
    }
}
