package Chapter6.Cooperation;

public class train {
    int passengerCount;
    int money;
    int traninNumber;

    train(int trainNumber){
        this.traninNumber = trainNumber;
    }

    public void takenPassenger(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("passenger =" + passengerCount + " ,  Money = " + money );
    }
}
