import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (UC3: String Reverse) ---");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();


        String cleaned = original.replaceAll("\\s+", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();


        System.out.println("Original (Cleaned): " + cleaned);
        System.out.println("Reversed: " + reversed);

        if (cleaned.equals(reversed)) {
            System.out.println("Result: '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}