
class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class Bank {

    public static void main(String args[]) {
        BankAccount acc = new BankAccount("Rahul", 1000.0);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500.0);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        acc.withdraw(1500.0); // Should show insufficient balance
    }
}
