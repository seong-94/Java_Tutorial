package Chapter9.template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===AI Car===");
        Car car1 = new AICar();
        car1.run();

        System.out.println("===Manual Car===");
        Car car2 = new ManualCar();
        car2.run();
    }
}
