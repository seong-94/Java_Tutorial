package Chapter6;

class Person2 {
    String name;
    int age;

    Person2() {
        this("name", 1);
    }

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person2 returnItSelf() {
        return this;
    }
}

   public class CallAnotherCont{// 
    public static void main(String[] args) {
       

            Person2 person1 = new Person2();
            System.out.println(person1.age);
            System.out.println(person1.name);

            Person2 person2 = new Person2();

            System.out.println(person2);
            System.out.println(person2.returnItSelf());
        }

    }
