package anudip.Multithreading;

public class PracticalActivity1 {

    static class BankTransaction extends Thread {

        private String transactionName;

        public BankTransaction(String transactionName) {
            this.transactionName = transactionName;
        }

        public void run() {
            System.out.println(transactionName + " Under Process");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Transaction Failed..");
            }

            System.out.println(transactionName + " Transaction Completed");
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Banking System...");

        BankTransaction deposit = new BankTransaction("Deposit");
        BankTransaction withdrawal = new BankTransaction("Withdrawal");

        deposit.start();
        withdrawal.start();
    }
}
