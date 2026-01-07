package ThreadPrograms;
class Counter {

    // Shared variable
    private int c = 0;

    // NOT synchronized
    public void inc() {
        c++;   // NOT thread-safe
    }

    // NOT synchronized
    public int get() {
        return c;
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws Exception{
        Counter cnt = new Counter(); // shared resource

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + cnt.get());
    }
}
