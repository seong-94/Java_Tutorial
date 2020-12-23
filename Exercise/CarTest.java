package Exercise;

import java.util.ArrayList;



public class CarTest {
    public static void main(String[] args) {
        
        ArrayList<chapter_9_Q5_Car> carlist = new ArrayList<>();

        carlist.add(new Sonata());
        carlist.add(new Genesis());
        carlist.add(new Grandeur());
        carlist.add(new Avante());

        for(chapter_9_Q5_Car car: carlist){
            car.run();
            System.out.println();
            
        }
       
    }
}
