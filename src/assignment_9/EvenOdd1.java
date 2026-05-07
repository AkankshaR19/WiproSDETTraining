package assignment_9;

class EvenOdd {
    private int num = 1;
    private final int LIMIT = 100;

    public synchronized void printOdd() {
        while (num <= LIMIT) {
            if (num % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + num++);
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (num <= LIMIT) {
            if (num % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + num++);
                notify();
            }
        }
    }
}

public class EvenOdd1 {
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}