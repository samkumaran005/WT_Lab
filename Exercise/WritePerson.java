import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class WritePerson {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
            System.out.println("Person object saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}