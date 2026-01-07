package ThreadPrograms;
class Plate {
    private boolean available = true;

    public synchronized boolean isAvailable() {
        return available;
    }

    public synchronized void use(String name) {
        available = false;
        System.out.println(name + " is eating 🍽️");
    }
}
class Partner {
    private String name;
    private Plate plate;
    private boolean polite = true;

    public Partner(String name, Plate plate) {
        this.name = name;
        this.plate = plate;
    }

    public void eat(Partner other) {
        while (plate.isAvailable()) {

            if (polite) {
                System.out.println(name + " says: " + other.name + " please eat");
                polite = false;   // stop yielding
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            } else {
                plate.use(name);
            }
        }
    }
}
public class LiveLock {
    public static void main(String[] args) {

        Plate p = new Plate();

        Partner husband = new Partner("Husband", p);
        Partner wife = new Partner("Wife", p);

        new Thread(() -> husband.eat(wife)).start();
        new Thread(() -> wife.eat(husband)).start();
    }
}
