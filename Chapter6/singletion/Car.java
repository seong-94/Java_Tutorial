package Chapter6.singletion;

public class Car {
    private static int carNum = 10000;
    private int carID;

    public Car() {
        carNum++;
        carID = carNum;
    }

    public int getCarNum() {
        return carID;
    }

    public void setCarNum(int carID) {
        this.carID = carID;
    }

}
