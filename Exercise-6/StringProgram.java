import java.util.*;
public class StringProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two strings to concatenate : ");
        String str1 = sc.next();
        String str2 = sc.next();
        String concatenated = str1 + str2; 
        String checkWord = "String Exercises";
        boolean containsX = checkWord.toLowerCase().contains("x");
        System.out.println("Enter Two strings to check equality: ");
        String a = sc.next();
        String b = sc.next();
        System.out.println("Enter a string to count upper and lower case : ");
        String text = sc.next();
        int upper = 0, lower = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
        }
        System.out.println("Enter Two strings to check anagram : ");
        String word1 = sc.next();
        String word2 = sc.next();
        boolean isAnagram = checkAnagram(word1, word2);
        System.out.println("1. Concatenated String: " + concatenated);
        System.out.println("2. Does '" + checkWord + "' contain 'x'? " + containsX);
        System.out.println("3. Using equals():" + a.equals(b));
        System.out.println("   Using compareTo():" + a.compareTo(b));
        System.out.println("   Using '==':" + (a == b));
        System.out.println("4. Uppercase letters: " + upper);
        System.out.println("   Lowercase letters: " + lower);
        System.out.println("5. Are '" + word1 + "' and '" + word2 + "' Anagrams? " + isAnagram);
    }
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}