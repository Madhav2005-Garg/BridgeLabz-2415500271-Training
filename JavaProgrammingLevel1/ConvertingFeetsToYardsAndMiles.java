import java.util.Scanner;

public class ConvertingFeetsToYardsAndMiles{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length in feet:");
        int totalFeet = scanner.nextInt();

        int miles = totalFeet / 5280;
        int remainingFeetAfterMiles = totalFeet % 5280;
        int yards = remainingFeetAfterMiles / 3;
        int remainingFeet = remainingFeetAfterMiles % 3;

        System.out.println(totalFeet + " feet is " + miles + " mile(s), " + yards + " yard(s), and " + remainingFeet + " feet.");

        scanner.close();
    }
}
