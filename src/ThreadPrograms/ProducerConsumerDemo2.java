package ThreadPrograms;
class Producer1 extends Thread {

    ProducerConsumer pc;

    Producer1(ProducerConsumer pc) {
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
class Consumer1 extends Thread {

    ProducerConsumer pc;

    Consumer1(ProducerConsumer pc) {
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
public class ProducerConsumerDemo2 {
    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Producer1 producer = new Producer1(pc);
        Consumer1 consumer = new Consumer1(pc);

        producer.start();
        consumer.start();
    }
}
