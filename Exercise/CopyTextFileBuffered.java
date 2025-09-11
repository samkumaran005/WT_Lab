import java.io.*;
public class CopyTextFileBuffered {
    public static void main(String[] args) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"))
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
