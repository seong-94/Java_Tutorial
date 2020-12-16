package Chapter9.step1;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        autoCar autoCar = new autoCar();

        bus.run();
        autoCar.run();

        bus.reful();
        autoCar.reful();
        
        bus.takePassenger();
        autoCar.load();

        bus.stop();
        autoCar.stop();
    }
}
