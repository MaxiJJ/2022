package WriteReadObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMassive {

    public static void main(String[] args) {

        Person[] people = {new Person(1, "Carl"), new Person(2, "John"),
                new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("test.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
