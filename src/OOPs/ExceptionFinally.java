package OOPs;

public class ExceptionFinally {
    public static void main(String[] args) {
        try{
            int a =10/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){

        }
        multiCatch();
    }

    public static void multiCatch(){
        try{

        }catch(NumberFormatException | NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
