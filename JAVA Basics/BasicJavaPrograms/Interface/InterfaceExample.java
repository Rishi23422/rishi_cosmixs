package Interface;

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        System.out.println();

        Cat cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
