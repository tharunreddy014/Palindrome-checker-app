import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Character Array) ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        int n = charArray.length;


        for (int i = 0; i < n / 2; i++) {
            if (charArray[i] != charArray[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}