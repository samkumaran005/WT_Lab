public class WhileLoop {
    public static void main(String[] args) {
        int i = -2;
        while (i <= 2) {
            if (i >= 0) {
                System.out.println(i + " is positive");
            } else {
                System.out.println(i + " is negative");
            }
            i++;
        }
    }
}
