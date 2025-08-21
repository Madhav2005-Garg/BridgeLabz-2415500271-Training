import java.util.Scanner;

public class CalculatingDiscountGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter original price:");
        double fee = sc.nextDouble();

        System.out.println("Enter discount percentage:");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalPrice = fee - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}