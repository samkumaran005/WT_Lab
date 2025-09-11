import java.io.FileWriter;
import java.io.IOException;
public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("mydata.txt", true)) {  // true enables append mode
            writer.write("\nThis is appended text.");
            System.out.println("Text appended to mydata.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
