package Chapter5;

public class PersonTest {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "LSS";
        person1.height = 172.5F;
        person1.weight = 82.5F;

        Person2 person2 = new Person2("KBS", 110.2F,100.4F);
        
        System.out.println(person2.name);
        


    }
}
