public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        String original = input;
        String reverse = "";


        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }


        System.out.println("Hardcoded String: " + input);
        if (original.equals(reverse)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
