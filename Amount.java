import java.util.Scanner;

// Define the Account class
class Account {
    private int accountNumber;
    private String name;
    private double balance;

    // No-argument constructor
    Account() {
        accountNumber = 0;
        name = "";
        balance = 0.0;
    }

    // Parameterized constructor
    Account(int accountNumber, String name, double balance) {
this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to accept account details
    void acceptAccountDetails() {
        Scanner scanner = new Scanner(System.in);
System.out.println("\nName: Sannidhi Deb");
System.out.println("Roll No: 2330044");
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter account holder name: ");
        name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        balance = scanner.nextDouble();
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
 System.out.println("Balance: Rs. " + balance);
    }

    // Method to credit account
    void creditAccount(double amount) {
        balance += amount;
        System.out.println("A/C credited with Rs. " + amount + " and Balance: Rs. " + balance);
    }

    // Method to debit account
    void debitAccount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("A/C debited with Rs. " + amount + " and Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
public class Amount {
    public static void main(String[] args) {
        Account account = new Account();
        account.acceptAccountDetails();
        System.out.println("\nAccount Details:");
        account.displayAccountDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter amount to credit: ");
        double creditAmount = scanner.nextDouble();
        account.creditAccount(creditAmount);

        System.out.print("\nEnter amount to debit: ");
        double debitAmount = scanner.nextDouble();
        account.debitAccount(debitAmount);
    }
}


