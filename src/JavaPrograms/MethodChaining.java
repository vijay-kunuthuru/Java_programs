package JavaPrograms;

public class MethodChaining {
    private String name;
    private int age;

    public MethodChaining setname(String name){
        this.name=name;
        return this;
    }
    public MethodChaining setage(int age){
        this.age =age;
        return this;
    }
    public void display(){
        System.out.println("name: "+name+", Age: "+ age);
    }

    public static void main(String[] args) {
        MethodChaining builder=new MethodChaining();
        builder.setname("john").setage(30).display();
    }
}

