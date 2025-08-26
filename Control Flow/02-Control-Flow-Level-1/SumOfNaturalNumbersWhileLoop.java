import java.util.Scanner;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("✅ Both computations are correct!");
            } else {
                System.out.println("❌ The results do not match.");
            }
        }
    }
}
