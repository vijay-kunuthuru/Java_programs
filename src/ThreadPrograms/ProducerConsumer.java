package ThreadPrograms;
//create 2 threads t1 --produce--1 to 5
//create t2 ----consume method-----1 to 5
class Producer extends Thread {

    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pc.produce(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Consumer extends Thread {

    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pc.consume();
                Thread.sleep(800);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class ProducerConsumer {
    int item;
    boolean available = false;
     synchronized void produce(int value) throws Exception{
         while (available)
             wait();
         item = value;
         available = true;
         System.out.println("produceed: "+ item);
         notify();

     }
     synchronized int consume() throws Exception{
         while(!available)
             wait();
         available = false;
         System.out.println("consumed: "+ item);
         notify();
         return item;
     }
}
