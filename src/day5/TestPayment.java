package day5;

class Payment1 {

    final void processPayment() {
        System.out.println("Processing secure payment...");
    }
}

class UPI extends Payment1 {


    void pay() {
        System.out.println("UPI Payment done");
    }
}

public class TestPayment {
    public static void main(String[] args) {

        UPI obj = new UPI();
        obj.processPayment();
        obj.pay();
    }
}