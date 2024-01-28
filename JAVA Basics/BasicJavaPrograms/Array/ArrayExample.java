package Array;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element of the array
        numbers[3] = 10;
        System.out.println("Modified fourth element: " + numbers[3]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Iterating over the array using a for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Declaring and initializing an array of strings
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Alice";

        // Accessing elements of the array
        System.out.println("First name: " + names[0]);
        System.out.println("Second name: " + names[1]);
        System.out.println("Third name: " + names[2]);

        // Length of the array
        System.out.println("Length of the array: " + names.length);

        // Iterating over the array using a for-each loop
        System.out.print("Array elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}