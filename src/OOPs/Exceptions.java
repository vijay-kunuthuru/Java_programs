package OOPs;

public class Exceptions {
    //exception example can be handled
    public static void handledException(){
        try{
            int[] arr=new int[5];
            System.out.println(arr[10]); //will thow exception
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught and handled :"+ e.getMessage());
        }
    }

    //error example - shouldn't be caught
    public  static void demonstrateError(){
        try{
            recusiveMethod(); // will cause StackOverError
        }catch(StackOverflowError e){
            System.out.println("Error occured (but don't do this!)");
        }
    }
    private static void recusiveMethod(){
        recusiveMethod();// infinite recursion
    }
}
