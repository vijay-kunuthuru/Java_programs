package JavaPrograms;

public class conditional2 {
    public static void main(String[] args){
        display();
    }

    public static void display(){
        int day=4;
        switch(day){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            default:System.out.println("Invalid day");
        }
    }
}
