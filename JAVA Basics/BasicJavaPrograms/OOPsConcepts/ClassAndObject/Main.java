package OOPsConcepts.ClassAndObject;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.startEngine();

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);
    }
}
