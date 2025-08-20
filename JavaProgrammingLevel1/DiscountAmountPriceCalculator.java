public class DiscountAmountPriceCalculator {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discountAmount = (discountPercent / 100) * fee;
        double discountedPrice = fee - discountAmount;

        System.out.println("Course Fee: INR " + fee);
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Amount to be paid after discount: INR " + discountedPrice);
    }
}
