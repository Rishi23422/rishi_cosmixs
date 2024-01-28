package OOPsConcepts.Inheritance.HierarchicalInheritance;

// Main class to demonstrate hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal class
        dog.bark(); // Defined in Dog class

        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal class
        cat.meow(); // Defined in Cat class
    }
}