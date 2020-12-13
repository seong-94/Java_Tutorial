package Chapter6.singletion;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car creatCar() {

        Car car = new Car();
        return car;
    }

}
