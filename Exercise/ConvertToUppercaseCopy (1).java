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

public class ConvertToUppercaseCopy {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt")
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                // Convert lowercase letters to uppercase
                if (b >= 'a' && b <= 'z') {
                    b = b - ('a' - 'A');
                }
                fos.write(b);
            }
            System.out.println("File copied with uppercase conversion.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
