class BaseClass {
    protected int protectedValue = 100;
}
public class ProtectedAccess extends BaseClass {
    public void display() {
        System.out.println("Accessing Protected Value from subclass: " + protectedValue); // ✅
    }
    public static void main(String[] args) {
        ProtectedAccess obj = new ProtectedAccess();
        obj.display();
    }
}