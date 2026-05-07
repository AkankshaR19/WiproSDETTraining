package day7;
import java.lang.*;
class MyRunnable implements Runnable {
    public void run() {
        for (int i=1; i<=5; i++) {
        	System.out.println("Runnable Thread");
        }
    }
}
public class ThreadEx2{
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start(); //calls run method internally
    }
}