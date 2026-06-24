package anudip.LAB4;

class Bankaccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    // Constructor
    public Bankaccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Get Balance
    public double getBalance() {
        return accountBalance;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " deposited into " + bankName + " account.");
        }
    }

    // Withdraw Money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(amount + " withdrawn from " + bankName + " account.");
        } else {
            System.out.println("Insufficient balance in " + bankName + " account.");
        }
    }

    // Display Account Details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: ₹" + accountBalance);
        System.out.println();
    }
public static void main(String[] args) {

        // Creating three bank accounts
        Bankaccount acc1 = new Bankaccount("Ansh", "ICICI", 10000);
        Bankaccount acc2 = new Bankaccount("Rahul", "HDFC", 15000);
        Bankaccount acc3 = new Bankaccount("Priya", "SBI", 20000);

        // Transactions for ICICI account
        acc1.deposit(5000);
        acc1.withdraw(2000);

        // Transactions for HDFC account
        acc2.deposit(3000);
        acc2.withdraw(4000);

        // Transactions for SBI account
        acc3.deposit(7000);
        acc3.withdraw(5000);

        // Display balances
        System.out.println("\nFinal Account Details:");
        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}