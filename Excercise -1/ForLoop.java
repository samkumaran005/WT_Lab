import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter n value: ");
        int n = s.nextInt();
        for (int x = 1; x <= n; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}