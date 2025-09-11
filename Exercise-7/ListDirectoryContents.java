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
import java.util.Scanner;

public class ListDirectoryContents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory.");
        } else {
            File[] files = dir.listFiles();
            if (files != null) {
                System.out.println("Contents of directory:");
                for (File f : files) {
                    String type = f.isDirectory() ? "Directory" : "File";
                    System.out.println(type + ": " + f.getName());
                }
            }
        }
        sc.close();
    }
}

