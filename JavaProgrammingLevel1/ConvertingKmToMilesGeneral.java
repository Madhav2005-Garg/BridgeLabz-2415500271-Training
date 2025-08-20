import java.util.Scanner;

public class ConvertingKmToMilesGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in kilometers:");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " km is " + miles + " miles.");

    }
}