import java.util.Random;
import java.util.Scanner;
public class RandomPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*-_";
        String allChars = upper + lower + digits + special;
        System.out.print("Enter desired password length: ");
        int length = sc.nextInt();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());
    }
}