package JavaPrograms;

public class PassByRef {
    static class Person{
        String name;
        Person(String name){this.name=name;}
    }

    public void modifyPerson(Person p){
        p.name ="Modified";
    }

    public static void main(String[] args){
        Person person = new Person("Original");
        PassByRef obj=new PassByRef();
        obj.modifyPerson(person);
        System.out.println(person.name);
    }
}
