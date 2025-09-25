import java.util.*;
public class Inventory {
    private final Map<String, Integer> inventory = new HashMap<>();
    public void addItem(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }
    public void updateQuantity(String product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, quantity);
        }
    }
    public void displayInventory() {
        inventory.forEach((product, quantity) -> System.out.println(product + ": " + quantity));
    }
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem("Apple", 10);
        inv.addItem("Banana", 5);
        inv.addItem("Orange", 8);
        inv.updateQuantity("Apple", 12);
        System.out.println("Current Inventory:");
        inv.displayInventory();
    }
}