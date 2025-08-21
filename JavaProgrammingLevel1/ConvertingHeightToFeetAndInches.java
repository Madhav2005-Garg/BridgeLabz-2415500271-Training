import java.util.Scanner;

public class ConvertingHeightToFeetAndInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length in centimeters:");
        int totalCm = scanner.nextInt();

        double totalInches = totalCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);

        System.out.println(totalCm + " cm is " + feet + " feet and " + inches + " inches.");

        scanner.close();
    }
}
