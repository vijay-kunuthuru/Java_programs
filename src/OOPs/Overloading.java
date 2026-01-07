package OOPs;

public class Overloading {
    public int add(int a, int b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add("Vijay ","Hello"));
        System.out.println(obj.add(10,20,30));
    }
}
