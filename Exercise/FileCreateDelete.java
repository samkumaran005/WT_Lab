import java.io.File;
import java.io.IOException;
public class FileCreateDelete {
    public static void main(String[] args) {
        String dirPath = "myDir";
        String filePath = dirPath + File.separator + "data.txt";
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + filePath);
            } else {
                System.out.println("File already exists.");
            }
            if (file.delete()) {
                System.out.println("File deleted: " + filePath);
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

