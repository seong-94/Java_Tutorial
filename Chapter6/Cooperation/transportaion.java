package Chapter6.Cooperation;

public class transportaion {
    public static void main(String[] args) {
        Student student = new Student("seong seok lee", 10000);
       // Student student2 = new Student("ji su yu", 5000);
        
        
        Bus bus1 = new Bus(545);
        //train train1 = new train(9);

        student.BusPay(bus1);

        bus1.showInfo();
        student.showInfo();
    }
}
