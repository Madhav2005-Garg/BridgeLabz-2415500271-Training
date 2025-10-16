package BankApplication;
abstract class Account implements ITransaction {
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;

    public Account(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void displayAccountType();

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
