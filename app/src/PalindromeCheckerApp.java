import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Stack-Based Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Core Logic for UC5
     * 1. Clean the string (remove spaces/special chars).
     * 2. Push characters onto the Stack.
     * 3. Pop characters to form a reversed string.
     * 4. Compare original with reversed.
     */
    public static boolean isPalindrome(String str) {

        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanStr.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < cleanStr.length(); i++) {
            stack.push(cleanStr.charAt(i));
        }


        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }


        return cleanStr.equals(reversedStr.toString());
    }
}