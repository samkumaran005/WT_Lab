import java.io.File;
import java.util.Scanner;
public class FilePropertiesChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a file or directory path: ");
            String path = sc.nextLine();
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Path does not exist.");
            } else {
                System.out.println("Path exists.");
                if (file.isFile()) {
                    System.out.println("It is a file.");
                } else if (file.isDirectory()) {
                    System.out.println("It is a directory.");
                }
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
            }
        }
    }
}