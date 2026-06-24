package anudip.LAB4;

public class Main {
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
