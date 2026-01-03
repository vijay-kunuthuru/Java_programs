package JavaPrograms;

public class PassByvalue {
    public static void main(String[] args){
        PassByvalue obj=new PassByvalue();
        int x=10;
        obj.modifyValue(x);
        System.out.println("After method : "+ x);
    }

    public static void modifyValue(int number){
        number = number*2;
        System.out.println("Inside method : "+ number);
    }
}
