import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}