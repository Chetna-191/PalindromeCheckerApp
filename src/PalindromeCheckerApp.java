import java.util.Scanner;
import java.util.Stack;

class StringPalindromeService {

    private String input;

    public StringPalindromeService(String input) {
        this.input = input;
    }

    public boolean checkPalindrome() {

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        for (int i = 0; i < processed.length(); i++) {
            if (processed.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC11) ===");
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();

        StringPalindromeService service = new StringPalindromeService(userInput);

        boolean result = service.checkPalindrome();

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}