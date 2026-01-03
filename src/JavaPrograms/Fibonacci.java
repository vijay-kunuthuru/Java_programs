package JavaPrograms;

public class Fibonacci {
    public static int fibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }

    public static void main(String[] args) {
        int n=0;
        System.out.println("Fibonacci series");
        for (int i = 0; i <n ; i++) {
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
}
