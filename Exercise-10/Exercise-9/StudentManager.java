import java.util.*;
class Student {
    int id;
    String name;
    String grade;
    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
public class StudentManager {
    private final List<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudentById(int id) {
        students.removeIf(student -> student.id == id);
    }
    public Student findStudentById(int id) {
        return students.stream().filter(student -> student.id == id).findFirst().orElse(null);
    }
    public void listAllStudents() {
        students.forEach(System.out::println);
    }
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1, "Alice", "A"));
        manager.addStudent(new Student(2, "Bob", "B"));
        manager.addStudent(new Student(3, "Charlie", "A"));
        manager.listAllStudents();
        System.out.println("Find student with ID 2: " + manager.findStudentById(2));
        manager.removeStudentById(1);
        System.out.println("After removal: ");
        manager.listAllStudents();
    }
}