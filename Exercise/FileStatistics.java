import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileStatistics {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    continue;
                }
                wordCount += words.length;
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
