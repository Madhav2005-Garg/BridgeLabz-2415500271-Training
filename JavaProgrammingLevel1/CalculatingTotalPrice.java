import java.util.Scanner;

public class CalculatingTotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of units:");
        int numberOfUnits = scanner.nextInt();

        System.out.println("Enter price per unit:");
        double pricePerUnit = scanner.nextDouble();

        double totalPrice = numberOfUnits * pricePerUnit;

        System.out.println("Number of units: " + numberOfUnits);
        System.out.println("Price per unit: " + pricePerUnit);
        System.out.println("Total price: " + totalPrice);

        scanner.close();
    }
}
