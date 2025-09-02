import java.util.*;

public class BMICalculator {

    public static double[][] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        return hw;
    }

    public static String[][] calculateBMI(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4];
        for (int i = 0; i < n; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightCm);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                               result[i][1] + "\t\t" +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] hw = takeInput(n);
        String[][] result = calculateBMI(hw);
        displayResult(result);
    }
}
