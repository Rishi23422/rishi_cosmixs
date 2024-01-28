package OOPsConcepts.Inheritance.MultiLevelInheritance;

// Main class to demonstrate multilevel inheritance
public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // Inherited from Animal class
        labrador.bark(); // Inherited from Dog class
        labrador.color(); // Defined in Labrador class
    }
}