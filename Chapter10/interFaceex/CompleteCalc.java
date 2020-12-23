package Chapter10.interFaceex;

public class CompleteCalc extends Claculator {
    @Override
    public int add(int num1, int num2) {

        return super.add(num1, num2);
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0)
            return super.divide(num1, num2);
        else
            return Calc.ERROR;
    }

    @Override
    public int time(int num1, int num2) {

        return super.time(num1, num2);
    }

    @Override
    public int substract(int num1, int num2) {

        return super.substract(num1, num2);
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
