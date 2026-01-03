package JavaPrograms;

public class VarArgs {
    public int sum(int... numbers){
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        VarArgs obj=new VarArgs();
        System.out.println(obj.sum());
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum(1,2,3,4,5));
    }
}