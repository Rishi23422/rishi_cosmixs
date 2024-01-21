package SuperKeyword;

// Child class inheriting from Animal
class Dog extends Animal {
    String color = "Black";

    void displayColor() {
        System.out.println("Dog color: " + color); // Output: Black
        System.out.println("Animal color: " + super.color); // Output: White (accesses the color from the parent class using super keyword)
    }
}