package Chapter6.Cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void takenPassenger(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("Passenger" + " = " + passengerCount + " money = " + money);
    }
}
