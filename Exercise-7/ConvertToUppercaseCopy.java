import java.io.*;
public class ConvertToUppercaseCopy {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt")
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                if (b >= 'a' && b <= 'z') {
                    b = b - ('a' - 'A');
                }
                fos.write(b);
            }
            System.out.println("File copied with uppercase conversion.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}