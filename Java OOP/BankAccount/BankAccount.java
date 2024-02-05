import java.util.Random;

public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalAmountStored = 0;
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    // Constructor
    public BankAccount() {
        numberOfAccounts++;
        this.accountNumber = generateAccountNumber();
    }

    // Getter method for checking account balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Getter method for savings account balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Method to deposit money into either checking or savings
    public void deposit(double amount, String accountType) {
        if ("checking".equalsIgnoreCase(accountType)) {
            checkingBalance += amount;
        } else if ("savings".equalsIgnoreCase(accountType)) {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }

    // Method to withdraw money from either checking or savings
    public void withdraw(double amount, String accountType) {
        if ("checking".equalsIgnoreCase(accountType) && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalAmountStored -= amount;
        } else if ("savings".equalsIgnoreCase(accountType) && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalAmountStored -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to see total money from checking and savings
    public void displayTotalAmount() {
        System.out.println("Total Money: " + totalAmountStored);
    }

    // Private method to generate a random ten-digit account number
    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(rand.nextInt(10));
        }
        return accountNumber.toString();
    }

    // Getter method for the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for the number of accounts created
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    // Getter method for the total amount stored
    public static double getTotalAmountStored() {
        return totalAmountStored;
    }
}