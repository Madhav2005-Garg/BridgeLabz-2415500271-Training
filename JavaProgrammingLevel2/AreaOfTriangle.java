import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base of the triangle in cm: ");
		double base = scanner.nextDouble();
		System.out.print("Enter height of the triangle in cm: ");
		double height = scanner.nextDouble();

		double areaSqCm = 0.5 * base * height;
		double areaSqIn = areaSqCm / (2.54 * 2.54);

		System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

		scanner.close();
	}
}
