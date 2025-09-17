import java.io.*;
public class PersonExample {
    public static class Person implements Serializable {
        private final String name;
        private final int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }
    public static void writePersonToFile(String filename, Person person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Person object saved.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }
    }
    public static Person readPersonFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        String filename = "person.dat";
        writePersonToFile(filename, person);
        Person readPerson = readPersonFromFile(filename);
        if (readPerson != null) {
            System.out.println("Read person: " + readPerson);
        }
    }
}
