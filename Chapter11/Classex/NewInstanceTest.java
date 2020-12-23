package Chapter11.Classex;

public class NewInstanceTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person1 = new Person();
        System.out.println(person1);


        Class pClass = Class.forName("Chapter11.Classex.Person");
        Person person2 = (Person) pClass.newInstance();//
        System.out.println(person2);
         
    }
}
