package Chapter11.Classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass(); // getclass 메서드 직접사용 
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 class 파일을 대입 시킴 
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("Chapter11.Classex.Person");// 클래스의 이름으로 가져오기 
        System.out.println(pClass3.getName());


    }
}
