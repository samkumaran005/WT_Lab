class DefaultClass {
    int defaultValue = 50;
}
public class DefaultAccess {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println("Default Value: " + obj.defaultValue);
    }
}