package ThreadPrograms;

public class ThreadState {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() ->{
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
        });

        System.out.println(t.getState()); // new
        t.start();
        System.out.println(t.getState());//Runnable
        Thread.sleep(500);
        System.out.println(t.getState());//Timed Waiting
        t.join();
        System.out.println(t.getState());//Terminated
    }
}
