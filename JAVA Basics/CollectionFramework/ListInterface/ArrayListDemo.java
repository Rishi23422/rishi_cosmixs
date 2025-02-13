package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Durian");

        // Print the ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Add an element at a specific index
        arrayList.add(2, "Fig");
        System.out.println("ArrayList after adding at index 2: " + arrayList);

        // Get an element at a specific index
        String elementAtIndex = arrayList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // Update an element at a specific index
        arrayList.set(3, "Grape");
        System.out.println("ArrayList after updating at index 3: " + arrayList);

        // Remove an element at a specific index
        arrayList.remove(0);
        System.out.println("ArrayList after removing at index 0: " + arrayList);

        // Remove a specific element
        boolean removed = arrayList.remove("Cherry");
        System.out.println("ArrayList after removing 'Cherry': " + arrayList);
        System.out.println("Was 'Cherry' removed? " + removed);

        // Check if an element is present
        boolean containsDurian = arrayList.contains("Durian");
        System.out.println("Does the ArrayList contain Durian? " + containsDurian);

        // Get the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clear the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
