package BankApplication;
import java.util.*;
public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Welcome to Maddy Bank =====");
            System.out.println("1. Register (Sign Up)");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println("Thank you for using Java Bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    // User Registration
    public static void registerUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.println("Choose Account Type: ");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int accChoice = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter initial deposit: ");
        double balance = sc.nextDouble();

        Account account;
        if (accChoice == 1) {
            account = new SavingsAccount(username, accNum, balance);
        } else {
            account = new CurrentAccount(username, accNum, balance);
        }

        users.add(new User(username, password, account));
        System.out.println("User registered successfully!");
    }

    // User Login
    public static void loginUser() {
        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        User loggedInUser = null;

        for (User u : users) {
            if (u.getUsername().equals(uname) && u.checkPassword(pass)) {
                loggedInUser = u;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Invalid login! Try again.");
            return;
        }

        System.out.println("Login successful! Welcome " + uname);
        accountMenu(loggedInUser);
    }

    // Banking Menu for logged in user
    public static void accountMenu(User user) {
        int option;
        do {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    user.getAccount().deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    user.getAccount().withdraw(wd);
                    break;
                case 3:
                    System.out.println("Current Balance: " + user.getAccount().getBalance());
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (option != 4);
    }
}