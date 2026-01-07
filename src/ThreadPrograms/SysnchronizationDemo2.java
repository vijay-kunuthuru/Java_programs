package ThreadPrograms;

import org.w3c.dom.css.Counter;

class Counter1{
    private int c=0;
    //Synchronization method to increment counter
    public synchronized void inc(){

        c++;
    }

    public synchronized int get(){

        return c;
    }
}
public class SysnchronizationDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 cnt = new Counter1();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t1.join();
        System.out.println(cnt.get());
        System.out.println(t1.getState());
    }
}
