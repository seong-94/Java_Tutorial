package Chapter8.polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("Animal move out");

    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 펼칩니다.");
    }
}

public class AnimalTest1 {

    ArrayList<Animal> anilist = new ArrayList<>();

    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.addAnimal();
        System.out.println("원래 형으로 다운캐스팅");
        aTest.testCasting();


        
        // ani.move(); //상위 객체에서 하위 객체로 생성해서 하위 객체 메서드를 사용가능
        // aTest.moveAnimal(new Eagle());
        // aTest.moveAnimal(new Human());
        // aTest.moveAnimal(new Tiger());

    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void addAnimal() {
        anilist.add(new Human());
        anilist.add(new Tiger());
        anilist.add(new Eagle());
    
        for(Animal ani : anilist){
            ani.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < anilist.size(); i++) {
            Animal ani = anilist.get(i);
            if (ani instanceof Human) {
                Human h = (Human) ani;
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}