package day5;

class BankAccount {

    private final int accountNumber;

    BankAccount(int accNo) {
        this.accountNumber = accNo;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
    }
}

public class TestAccount {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(12345);
        acc.display();
    }
}
