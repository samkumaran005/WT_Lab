import java.util.regex.*;
public class RegexPrograms {
    public static void main(String[] args) {
        String text1 = "\"The quick brown fox jumps over the lazy dog\"";
        boolean containsThe = Pattern.compile("\\bthe\\b", Pattern.CASE_INSENSITIVE)
                                    .matcher(text1).find();
        System.out.println("1. The String " + text1 + " Contains 'the' (ignoring case): " + containsThe);
        String text2 = "\"Hello123\"";
        boolean hasDigit = Pattern.compile(".*\\d.*").matcher(text2).matches();
        System.out.println("2. The String " + text2 + " Contains at least one digit: " + hasDigit);
        String email = "\"test.user@example.com\"";
        boolean isValidEmail = Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
        System.out.println("3. Is " +email+ " valid email? " + isValidEmail);
        String text4 = "\"Phone number : 9876543210\"";
        String replaced = text4.replaceAll("\\d", "*");
        System.out.println("4. After replacing digits in " + text4 + ": " + replaced);
    }
}
