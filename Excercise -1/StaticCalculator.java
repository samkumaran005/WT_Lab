public class StaticCalculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int x = 5, y = 3;
        int sum = StaticCalculator.add(x, y);
        int product = StaticCalculator.multiply(x, y);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}