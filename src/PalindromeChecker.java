import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Input:"+input + "\nIs it a palindrome? : Yes");
        } else {
            System.out.println("Input:"+input + "\nIs it a palindrome? : No");
        }
    }
}