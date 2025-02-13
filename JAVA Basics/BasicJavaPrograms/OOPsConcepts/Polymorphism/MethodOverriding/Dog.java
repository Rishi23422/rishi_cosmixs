package OOPsConcepts.Polymorphism.MethodOverriding;

// Child class inheriting from Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
