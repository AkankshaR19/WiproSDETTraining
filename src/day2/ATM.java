package day2;

public class ATM {
	public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 1000;

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}
