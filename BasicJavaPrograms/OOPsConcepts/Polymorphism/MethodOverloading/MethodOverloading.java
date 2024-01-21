package OOPsConcepts.Polymorphism.MethodOverloading;

public class MethodOverloading {
    // Method with the same name but different parameters (overloading)
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of integers: " + add(3, 5));
        System.out.println("Sum of doubles: " + add(3.5, 2.7));
    }
}
