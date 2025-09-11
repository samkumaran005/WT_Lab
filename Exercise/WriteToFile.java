import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("mydata.txt")) {
            writer.write("Hello, Java Streams!");
            System.out.println("Data written to mydata.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}