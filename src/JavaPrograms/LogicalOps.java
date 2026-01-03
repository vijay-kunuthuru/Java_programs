package JavaPrograms;

public class LogicalOps {
    public static void main(String[] args){
        int age = 17;
        boolean hadID=true;

        if(age >= 18 && hadID){
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }
    }
}
