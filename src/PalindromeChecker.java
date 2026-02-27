import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean isPalindrome = true;

        for(int i=0; i< input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length() -1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is NOT a palindrome");
        }


    }
}
