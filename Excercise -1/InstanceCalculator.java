public class InstanceCalculator {
    int num1;
    int num2;
    public InstanceCalculator(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }
    public int subtract() {
        return num1 - num2;
    }
    public double divide() {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) num1 / num2;
    }
    public static void main(String[] args) {
        InstanceCalculator calc = new InstanceCalculator(10, 2);
        int diff = calc.subtract();
        double div = calc.divide();
        System.out.println("Difference = " + diff);
        System.out.println("Division = " + div);
    }
}