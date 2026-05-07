package assignment_9;

class ABC {
    private int turn = 0;

    public synchronized void printA() {
        while (true) {
            if (turn != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print("A ");
                turn = 1;
                notifyAll();
            }
        }
    }

    public synchronized void printB() {
        while (true) {
            if (turn != 1) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print("B ");
                turn = 2;
                notifyAll();
            }
        }
    }

    public synchronized void printC() {
        while (true) {
            if (turn != 2) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print("C ");
                turn = 0;
                notifyAll();
            }
        }
    }
}

public class Sequence {
    public static void main(String[] args) {
        ABC obj = new ABC();

        new Thread(() -> obj.printA()).start();
        new Thread(() -> obj.printB()).start();
        new Thread(() -> obj.printC()).start();
    }
}
