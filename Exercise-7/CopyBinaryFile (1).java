/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileInputOutput;

/**
 *
 * @author student
 */
import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("source.bin");   // replace with actual binary file name
            FileOutputStream fos = new FileOutputStream("destination.bin")
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("Binary file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
