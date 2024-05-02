import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account branch:");
        String accountBranch = sc.nextLine();
        System.out.print("Enter the account holder:");
        String accountHolder = sc.nextLine();
        System.out.print("Enter the balance:");
        double balance = sc.nextDouble();
        BankAccount bankAccount = new BankAccount(accountNumber, accountBranch, accountHolder, balance);
        System.out.println(bankAccount);
        sc.close();
    }
}