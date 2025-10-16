package BankApplication;

class User {
    private String username;
    private String password;
    private Account account;

    public User(String username, String password, Account account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }

    public Account getAccount() {
        return account;
    }
}