public class PalindromeChecker {
    static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        for(int i=0; i< input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length() -1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(input + ": is it a palindrome? : true");
        } else {
            System.out.println(input + ": is it a palindrome? : false");
        }

    }
}



