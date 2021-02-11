package Chapter15.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializationTest {
    public static void main(String[] args)  throws ClassNotFoundException {
        
        Person person1 = new Person("lee", "student");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);

        } catch (IOException e) {

            System.out.println(e);

        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object obj = ois.readObject();
                    if( obj instanceof Person){
                        Person p = (Person)obj;

                        System.out.println(p);
                    }
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}

class Person implements Serializable {// java.io.NotSerializableException: 객체의 정보를 외부로 유출하겟다라는 의미인데 이것을 허용해주지 않았기때문에
                                      // 오류가 남

    /**
     * Serializable 인터페이스를 implements 해서사용 해서 serial num 을 얻는다 . --> 표시 인터페이스
     */
    private static final long serialVersionUID = 5035798384117028377L;

    String name;
    String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + "  " + title;
    }
}
