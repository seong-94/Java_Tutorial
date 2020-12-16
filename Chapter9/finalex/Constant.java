package Chapter9.finalex;

public class Constant {
    int num = 10;
    final int Num = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        //cons.Num = 200; // 오류 발생함 final 예약어로 상수 선언을 했기 때문에 


        System.out.println(cons.Num);
        System.out.println(cons.num);
    }

}
