package JavaPrograms;

public class StaticMathodInvocation {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        int result = StaticMathodInvocation.add(5,3);
        System.out.println(result);
    }
}
