package Chapter6.Cooperation;

public class Student {
    public String studentName;
    public int grade;
    public int money;
    
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void BusPay(Bus bus){
        bus.takenPassenger(1000);
        this.money -= 1000;
    }
    public void TrainPay(train train){
        train.takenPassenger(1500);
        this.money -= 1500;
    }

    public void showInfo(){
        System.out.println(studentName + "  " + money);
    }
}
