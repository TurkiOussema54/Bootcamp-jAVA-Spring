public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Account 1 Number: " + account1.getAccountNumber());
        System.out.println("Account 2 Number: " + account2.getAccountNumber());

        account1.deposit(1000, "checking");
        account1.deposit(500, "savings");

        account2.deposit(2000, "checking");
        account2.deposit(1000, "savings");

        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());

        account1.withdraw(200, "checking");
        account2.withdraw(1500, "savings");

        System.out.println("Account 1 Checking Balance after withdrawal: " + account1.getCheckingBalance());
        System.out.println("Account 2 Savings Balance after withdrawal: " + account2.getSavingsBalance());

        account1.displayTotalAmount();
        System.out.println("Number of Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Amount Stored: " + BankAccount.getTotalAmountStored());
    }
}