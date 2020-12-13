package Exercise;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {

        ArrayList<Dog> dog = new ArrayList<Dog>();

        dog.add(new Dog("1", "1"));
        dog.add(new Dog("2", "2"));
        dog.add(new Dog("3", "3"));
        dog.add(new Dog("4", "4"));
        dog.add(new Dog("5", "5"));

        for (int i = 0; i < dog.size(); i++) {
            System.out.println(dog.get(i).showDogInfo());
        }
        
        System.out.println();

        for (Dog d : dog) {
            System.out.println(d.showDogInfo());
        }
    }
}
