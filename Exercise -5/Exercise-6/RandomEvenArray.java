import java.util.Random;
public class RandomEvenArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[5];
        System.out.print("Random even numbers: ");
        for (int i = 0; i < a.length; i++) {
            int num;
            do {
                num = rand.nextInt(10) + 1;
            } while (num % 2 != 0);
            a[i] = num;
            System.out.print(a[i] + " ");
        }
    }
}
