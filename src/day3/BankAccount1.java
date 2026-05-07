package day3;

class BankAccount {
    private double balance;    
    public void setBalance(double balance) {
        this.balance = balance;
    }    
    public double getBalance() {
        return balance;
    }  
    public void deposit(double amount) {
        balance += amount;
    }  
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
public class BankAccount1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1000);     
        acc.deposit(500);         
        acc.withdraw(300);        
        System.out.println("Final Balance: " + acc.getBalance());
    }
}