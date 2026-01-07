package ThreadPrograms;

class MyThread extends Thread{
    //Overriding the run method
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - count :"+ i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}
//Main class
public class Program{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2=new MyThread();

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start(); //invokes run()
        thread2.start();
    }
}
