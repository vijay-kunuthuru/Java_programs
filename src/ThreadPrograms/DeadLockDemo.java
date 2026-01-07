package ThreadPrograms;

public class DeadLockDemo {
    final static String R1 ="Hello welcome to scalar";
    final static String R2 ="Visit scalar";

    public static void main(String[] args) {
        //Creating Thread
        Thread T1 = new Thread(){
            //implementing run method
            public void run(){
                //thread T1 locking the R1 resource

                synchronized (R1){
                    System.out.println("Thread T1 locked -> Resource R1");

                    //Thread T1 locking R2 resource
                    synchronized (R2){
                        System.out.println("Thread T1 locked -> resource R2");
                    }
                }
            }
        };
        Thread T2 = new Thread(){
            //implementing run method
            public void run(){
                //thread T1 locking the R1 resource

                synchronized (R1){
                    System.out.println("Thread T2 locked -> Resource R2");

                    //Thread T1 locking R2 resource
                    synchronized (R2){
                        System.out.println("Thread T2 locked -> resource R1");
                    }
                }
            }
        };
        T1.start();
        T2.start();
    }
}
