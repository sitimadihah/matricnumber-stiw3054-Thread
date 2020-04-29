
package myrunnable;

public class MyRunnable implements Runnable {
    
public void run() {
    System.out.println(Thread.currentThread().getName());
}

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t1.start();
        t2.start();
        t3.start();
    }
    
}
