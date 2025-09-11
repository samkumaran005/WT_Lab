import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ReadPerson {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Read person: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
