import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("rock") && comp.equals("paper")) return "computer";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        if (user.equals("paper") && comp.equals("scissors")) return "computer";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("scissors") && comp.equals("rock")) return "computer";
        return "draw";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / games) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100) / games) + "%";
        return stats;
    }

    public static void displayResults(List<String[]> results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.size(); i++) {
            String[] r = results.get(i);
            System.out.println((i + 1) + "\t" + r[0] + "\t" + r[1] + "\t" + r[2]);
        }
        System.out.println("\nStats:");
        System.out.println("Player\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        int userWins = 0, compWins = 0;
        List<String[]> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            results.add(new String[]{userChoice, compChoice, winner});
        }
        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(results, stats);
        sc.close();
    }
}
