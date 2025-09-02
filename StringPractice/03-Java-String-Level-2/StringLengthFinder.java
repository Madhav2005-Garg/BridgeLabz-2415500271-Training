import java.util.Scanner;

public class StringLengthFinder {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int lengthCustom = findLength(input);
        int lengthBuiltIn = input.length();
        System.out.println("Length using custom method: " + lengthCustom);
        System.out.println("Length using built-in length() method: " + lengthBuiltIn);

        sc.close();
    }
}
