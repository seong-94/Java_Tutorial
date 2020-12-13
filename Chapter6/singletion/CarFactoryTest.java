package Chapter6.singletion;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car car1 = factory.creatCar();
        Car car2 = factory.creatCar();
        System.out.println(car1.getCarNum());
        System.out.println(car2.getCarNum());
        
    }
}
