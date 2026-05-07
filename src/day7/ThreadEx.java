package day7;
import java.lang.*;
class MyThread extends Thread {
    public void run() {
        for (int i=1; i<=5; i++) {
        	System.out.println("Thread running");
        }
    }
}
public class ThreadEx{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); //calls run method internally
    }
}
