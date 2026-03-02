import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase13PalindromePerformanceApp {

    // Stack-based palindrome check
    public static boolean isPalindromeStack(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : processed.toCharArray()) {
            stack.push(c);
        }
        for (char c : processed.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean isPalindromeDeque(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : processed.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer array approach
    public static boolean isPalindromeArray(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        char[] arr = processed.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String testInput = "Able was I ere I saw Elba";  // example palindrome

        // Stack Strategy
        long start = System.nanoTime();
        boolean stackResult = isPalindromeStack(testInput);
        long end = System.nanoTime();
        long stackTime = end - start;

        // Deque Strategy
        start = System.nanoTime();
        boolean dequeResult = isPalindromeDeque(testInput);
        end = System.nanoTime();
        long dequeTime = end - start;

        // Array Strategy
        start = System.nanoTime();
        boolean arrayResult = isPalindromeArray(testInput);
        end = System.nanoTime();
        long arrayTime = end - start;

        System.out.println("=== Palindrome Performance Comparison ===");
        System.out.println("Input: " + testInput + "\n");

        System.out.println("Stack Strategy: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Strategy: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Array Strategy: " + arrayResult + " | Time: " + arrayTime + " ns");
    }
}