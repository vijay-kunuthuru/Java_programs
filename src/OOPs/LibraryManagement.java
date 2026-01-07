package Polymorphism;
import java.util.*;
class Book{
    private String title;
    private String Author;
    private double ISBN;
    private int Copies;


    public Book(String title,String Author,double ISBN, int Copies){
        this.title=title;
        this.Author=Author;
        this.ISBN=ISBN;
        this.Copies=Copies;
    }

    public boolean isAvailable(){
        return Copies>0;
    }

    public void checkoutBook(){
        if(isAvailable()){
            Copies--;
            System.out.println(title+" is available");
        }else{
            System.out.println(title+" is not available");
        }
    }
    public void displayDetails(){
        System.out.println("title : "+title);
        System.out.println("Author : "+Author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("Copies : "+Copies);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book b1=new Book("Pirates","Jack Sparoww",5455, 5);
        Book b2=new Book("Avengers", "Tony Stark", 6455, 0);
        Book b3=new Book("Superman","charles", 4322,3);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

        b1.checkoutBook();
        b2.checkoutBook();
        b3.checkoutBook();

        System.out.println("\nAfter checkout");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
