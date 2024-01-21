package Constructor;

public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car();
        car1.display();

        System.out.println();

        Car car2 = new Car("Toyota", "Red");
        car2.display();
    }
}
