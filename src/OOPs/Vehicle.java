package OOPs;

class Vehicle1 {
    String registrationNumber;
    String model;
    double rentalRate;

    Vehicle1(String regNo, String model, double rate) {
        this.registrationNumber = regNo;
        this.model = model;
        this.rentalRate = rate;
    }

    double calculateRentalCost() {
        return 0;
    }
}
class car extends Vehicle1 {

    car(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
class Motorcycle extends Vehicle1 {

    Motorcycle(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    double calculateRentalCost(int hours) {
        return rentalRate * hours;
    }
}

class Truck extends Vehicle1 {

    Truck(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    double calculateRentalCost(int days, int mileage) {
        double costPerKm = 5;   // simple value
        return (rentalRate * days) + (mileage * costPerKm);
    }
}

public class Vehicle {
    public static void main(String[] args) {

        car car1 = new car("AP01", "Swift", 1000);
        System.out.println("Car Rent: " + car1.calculateRentalCost(3));

        Motorcycle bike = new Motorcycle("AP02", "Pulsar", 100);
        System.out.println("Bike Rent: " + bike.calculateRentalCost(5));

        Truck truck = new Truck("AP03", "Tata", 2000);
        System.out.println("Truck Rent: " + truck.calculateRentalCost(2, 50));
    }
}
