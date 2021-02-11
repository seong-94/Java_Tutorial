package Chapter15.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
// import java.io.Serializable;

public class serializationTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

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
            if (obj instanceof Person) {
                Person p = (Person) obj;

                System.out.println(p);
            }
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}

 class Person implements Externalizable {

    String name;
    String title;

    Person() {}

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + "  " + title;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(title);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readObject();
        in.readObject();
    }
}
