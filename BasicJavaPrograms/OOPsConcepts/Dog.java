package OOPsConcepts;

public class Dog {
    String name = "Jacky";
    String breed = "Bulldog";
    int height = 4;

    public void barking(){
        System.out.println(name + " is Barking");
    }

    public void eating(){
        System.out.println(name + " is Eating");
    }

    public static void main(String[] args) {

        Dog obj = new Dog();
        System.out.println("Name: " + obj.name);
        System.out.println("Breed: " + obj.breed);
        System.out.println("Height: " + obj.height);
        obj.barking();
        obj.eating();

        System.out.println("---------------------------------------");

        Dog obj1 = new Dog();
        System.out.println("Name: " + obj1.name);
        System.out.println("Breed: " + obj1.breed);
        System.out.println("Height: " + obj1.height);
        obj1.barking();
        obj1.eating();
        
    }
}
