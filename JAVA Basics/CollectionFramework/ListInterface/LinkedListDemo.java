package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Durian");

        // Print the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("Apricot");
        System.out.println("LinkedList after adding at the beginning: " + linkedList);

        // Add an element at the end
        linkedList.addLast("Elderberry");
        System.out.println("LinkedList after adding at the end: " + linkedList);

        // Get the first element
        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        // Get the last element
        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        // Remove the first element
        linkedList.removeFirst();
        System.out.println("LinkedList after removing the first element: " + linkedList);

        // Remove the last element
        linkedList.removeLast();
        System.out.println("LinkedList after removing the last element: " + linkedList);

        // Check if an element is present
        boolean containsDurian = linkedList.contains("Durian");
        System.out.println("Does the LinkedList contain Durian? " + containsDurian);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
