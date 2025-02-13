package Constructor;

class Car {
    String brand;
    String color;

    // Default constructor
    public Car() {
        brand = "Unknown";
        color = "Unknown";
    }

    // Parameterized constructor
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
