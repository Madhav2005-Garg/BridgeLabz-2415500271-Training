import java.util.Scanner;

public class CalculatingSideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter perimeter of the square:");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("Side of the square: " + side);
    }
}
