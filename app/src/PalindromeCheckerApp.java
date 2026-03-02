import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Deque-Based Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        // Cleanup: remove non-alphanumeric and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanInput.isEmpty()) return true;


        Deque<Character> deque = new ArrayDeque<>();


        for (char ch : cleanInput.toCharArray()) {
            deque.addLast(ch);
        }


        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();

            if (!front.equals(rear)) {
                return false; // Mismatch found
            }
        }

        return true; // All pairs matched
    }
}