class BalanceThread extends Thread {
    private int balance;

    public BalanceThread(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        int[] transactions = {100, 200, 150, 300}; // Money to be subtracted

        for (int amount : transactions) {
            balance -= amount;
            System.out.println("After subtracting " + amount + ", balance = " + balance);

            if (balance < 0) {
                System.out.println("Warning: Balance is in negative!");
            }

            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class demo2 {
    public static void main(String[] args) {
        BalanceThread bt = new BalanceThread(500); // starting with ₹500
        bt.start();
    }
}
