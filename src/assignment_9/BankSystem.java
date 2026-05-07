package assignment_9;


class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(() -> {
            acc.deposit(500);
            acc.withdraw(300);
        });

        Thread t2 = new Thread(() -> {
            acc.withdraw(700);
            acc.deposit(200);
        });

        t1.start();
        t2.start();
    }
}