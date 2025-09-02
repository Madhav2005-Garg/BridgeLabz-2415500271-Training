import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }
        return rev;
    }

    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1 (Iterative): " + (isPalindromeLogic1(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (isPalindromeLogic2(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Arrays): " + (isPalindromeLogic3(text) ? "Palindrome" : "Not Palindrome"));
    }
}
