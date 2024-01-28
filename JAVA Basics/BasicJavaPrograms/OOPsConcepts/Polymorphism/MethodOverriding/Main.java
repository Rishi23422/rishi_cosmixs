package OOPsConcepts.Polymorphism.MethodOverriding;

// Main class to demonstrate method overriding
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Some sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Bark (overrides the method in the parent class)
    }
}
