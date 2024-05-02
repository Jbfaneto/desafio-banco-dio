public class BankAccount {
    private int accountNumber;
    private String accountBranch;
    private String accountHolder;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String bankBranch, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountBranch = bankBranch;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountBranch() {
        return accountBranch;
    }

    public void setAccountBranch(String accountBranch) {
        this.accountBranch = accountBranch;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBranch='" + accountBranch + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + String.format("%.2f", balance) +
                '}';
    }
}
