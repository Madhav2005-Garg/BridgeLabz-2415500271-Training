import java.util.*;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61);
            scores[i][1] = 40 + rand.nextInt(61);
            scores[i][2] = 40 + rand.nextInt(61);
        }
        return scores;
    }

    public static double[][] calculateTotals(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] totals) {
        int n = totals.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double perc = totals[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayReport(int[][] scores, double[][] totals, String[] grades) {
        System.out.println("Stu\tPhysics\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) totals[i][0] + "\t" +
                    totals[i][1] + "\t" +
                    totals[i][2] + "\t" +
                    grades[i]);
        }
    }

    public static void displayGradeTable() {
        System.out.println("\nGrade Reference Table:");
        System.out.println("Grade\tRemarks\t\t\t\t\tMarks");
        System.out.println("A\t(Level 4, above agency-normalized)\t80% and above");
        System.out.println("B\t(Level 3, at agency-normalized)\t\t70-79%");
        System.out.println("C\t(Level 2, below but approaching)\t60-69%");
        System.out.println("D\t(Level 1, well below)\t\t\t50-59%");
        System.out.println("E\t(Level 1-, too below)\t\t\t40-49%");
        System.out.println("R\t(Remidial standards)\t\t\t39% and below");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] totals = calculateTotals(scores);
        String[] grades = calculateGrades(totals);
        displayReport(scores, totals, grades);
        displayGradeTable();
        sc.close();
    }
}
