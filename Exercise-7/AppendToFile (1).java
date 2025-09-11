/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileInputOutput;

/**
 *
 * @author student
 */
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
