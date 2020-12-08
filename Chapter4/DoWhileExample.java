package Chapter4;

public class DoWhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        

        do{ //조건식이 참이 아니여도 무조건 한번은 수행함
            sum += num;
            num++;
        }while(num <=10);{

        }
        System.out.println(sum);
    }
}
