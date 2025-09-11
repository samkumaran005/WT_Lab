import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("mydata.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

