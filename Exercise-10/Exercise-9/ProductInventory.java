import java.util.*;
public class ProductInventory {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Apple", 5);
        productMap.put("Banana", 15);
        productMap.put("Orange", 8);
        productMap.put("Mango", 20);
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            if (entry.getValue() > 10) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}