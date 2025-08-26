import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar first
        if (year < 1582) {
            System.out.println("The program works only for year >= 1582 (Gregorian calendar).");
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

    }
}
