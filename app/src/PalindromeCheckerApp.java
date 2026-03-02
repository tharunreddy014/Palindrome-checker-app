import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Stack & Queue) ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanInput.isEmpty()) return true;


        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (char ch : cleanInput.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }


        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false; // Mismatch found
            }
        }

        return true;
    }
}