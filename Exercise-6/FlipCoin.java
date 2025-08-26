import java.util.Random;
public class FlipCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        int flips = 10; 
        int heads = 0, tails = 0;
        for (int i = 0; i < flips; i++) {
            if (rand.nextBoolean()) {
                heads++;
                System.out.println("Flip " + (i+1) + ": Heads");
            } else {
                tails++;
                System.out.println("Flip " + (i+1) + ": Tails");
            }
        }
        System.out.println("Total Heads: " + heads);
        System.out.println("Total Tails: " + tails);
    }
}