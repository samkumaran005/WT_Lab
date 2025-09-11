/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileInputOutput;

/**
 *
 * @author student
 */
import java.io.File;
import java.io.IOException;

public class FileCreateDelete {
    public static void main(String[] args) {
        String dirPath = "myDir";
        String filePath = dirPath + File.separator + "data.txt";

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();  // create directory if not exists
        }

        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + filePath);
            } else {
                System.out.println("File already exists.");
            }

            // Now delete the file
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

