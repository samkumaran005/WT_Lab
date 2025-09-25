import java.util.*;
public class CountUnique {
    public static <T> int countUnique(List<T> list) {
        return new HashSet<>(list).size();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println("Unique elements count: " + countUnique(list));
    }
}