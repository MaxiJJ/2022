package WriteReadObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Carl");
        Person person2 = new Person(2, "John");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.bin"))) {
            //try with resources
            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
