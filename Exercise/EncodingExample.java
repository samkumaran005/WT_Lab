import java.io.*;
public class EncodingExample {
    public static void main(String[] args) {
        String filename = "encoded.txt";
        String text = "Hello, 你好, Привет!";
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), "UTF-8")) {
            writer.write(text);
            System.out.println("Text written with UTF-8 encoding.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename), "UTF-8")) {
            int ch;
            System.out.print("Read text: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

