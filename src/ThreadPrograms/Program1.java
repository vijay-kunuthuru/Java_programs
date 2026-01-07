package ThreadPrograms;

public class Program1 implements Runnable {
    public void run(){
        System.out.println("Thread is running concurrently...");
    }

    public static void main(String[] args) {
        Program1 task = new Program1();

        //task.start();

        Thread thread = new Thread(task);//pass the runnable object
        System.out.println("main thread continues execution...");
    }

}

