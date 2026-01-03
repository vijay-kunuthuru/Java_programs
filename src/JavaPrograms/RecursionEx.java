package JavaPrograms;

public class RecursionEx {
    public int factorial(int n){
        //base method
        if(n==0 || n==1){
            return 1;
        }
        //recursive case
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        RecursionEx obj=new RecursionEx();
        System.out.println("5! = "+ obj.factorial(5));
    }
}
