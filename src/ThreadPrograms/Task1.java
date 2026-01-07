package ThreadPrograms;
class Thread1 implements Runnable{
    String str;
    Thread1(String str){
        this.str = str;
    }
    public void run(){
        System.out.println("Normal : "+ str);
    }
}
class Thread2 implements Runnable{
    String str;
    Thread2(String str){
        this.str = str;
    }
    public void run(){
        String reverse="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse : "+ reverse);
    }
}
public class Task1 {
    public static void main(String[] args) {
        String str="vijay";

        Thread t1=new Thread(new Thread1(str));
        Thread t2=new Thread(new Thread2(str));

        t1.start();
        t2.start();
    }
}
