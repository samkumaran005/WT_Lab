import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter a number (1-3): ");
            choice = s.nextInt();
            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1:
                        System.out.println("You chose ONE");
                        break;
                    case 2:
                        System.out.println("You chose TWO");
                        break;
                    case 3:
                        System.out.println("You chose THREE");
                        break;
                }
            } else {
                System.out.println("Invalid input! Exiting loop.");
            }
        } while (choice >= 1 && choice <= 3);
    }
}