package Chapter6;

public class Person {

    String name;
    int age;

    Person() { //this 를 이용하여 person(String,int) 생성자를 호출
        this("seong soek lee", 1);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class CallAnotherCont {

        public static void main(String[] args) {
            Person person1 = new Person();
            System.out.println(person1.name);
            System.out.println(person1.age);
        }
    }

}
