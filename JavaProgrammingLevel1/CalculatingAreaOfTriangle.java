import java.util.Scanner;

public class CalculatingAreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of the triangle:");
        double base = sc.nextDouble();

        System.out.println("Enter height of the triangle:");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of the triangle: " + area);
    }
}
