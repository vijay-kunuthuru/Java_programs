package JavaPrograms;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ReferenceVariable {
    public static void main(String[] args){
        Student s1= new Student( "Vijay", 22);
        Student s2= s1;

        s2.name = "Updated Name";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
